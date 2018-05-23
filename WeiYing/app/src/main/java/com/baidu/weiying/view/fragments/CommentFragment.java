package com.baidu.weiying.view.fragments;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.presenter.CommentPresenter;
import com.baidu.weiying.view.adapters.CommentAdapter;
import com.baidu.weiying.view.api.Api;
import com.baidu.weiying.view.base.BaseFragment;
import com.baidu.weiying.view.bean.CommentSuperClass;
import com.baidu.weiying.view.ifragments.ICommentView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * 评论
 */

public class CommentFragment extends BaseFragment<CommentPresenter> implements ICommentView {
    private View view;
    /**
     * 暂无评论
     */
    private TextView mCommentTextView;
    private XRecyclerView mCommentRecyclerView;
    private CommentAdapter adapter;
    private List<CommentSuperClass.RetBean.ListBean> listAll;
    private int count = 1;

    @Override
    protected int getLayoutId() {
        return R.layout.comment_fragment;
    }

    @Override
    protected CommentPresenter getPresenter() {
        presenter = new CommentPresenter(this);
        return presenter;
    }

    @Override
    protected void initView(View view) {

        mCommentTextView = (TextView) view.findViewById(R.id.comment_textView);
        mCommentRecyclerView = (XRecyclerView) view.findViewById(R.id.comment_recyclerView);
        adapter = new CommentAdapter(getContext());
    }

    @Override
    protected void getData() {
        Bundle bundle = getArguments();
        String mediaId = bundle.getString("mediaId");
        presenter.getComment(Api.HOST_NAME, "92c79a87d6af4748b9f40a5189a5e7e0", count + "");

        mCommentRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mCommentRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));

        mCommentRecyclerView.setAdapter(adapter);

        //XRecyclerView的上下拉监听方法
        mCommentRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            //下拉刷新
            public void onRefresh() {
                count = 1;
                listAll.clear();
                presenter.getComment(Api.HOST_NAME, "92c79a87d6af4748b9f40a5189a5e7e0", count + "");
                mCommentRecyclerView.refreshComplete();
            }

            @Override
            //上拉加载
            public void onLoadMore() {
                count++;
                presenter.getComment(Api.HOST_NAME, "92c79a87d6af4748b9f40a5189a5e7e0", count + "");
                mCommentRecyclerView.refreshComplete();
            }
        });
    }

    @Override
    public void onFailed(String str) {
        Toast.makeText(getContext(), str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(List<CommentSuperClass.RetBean.ListBean> data) {
        if (data != null) {
            if (data.size() != 0) {
                mCommentTextView.setVisibility(View.GONE);
                mCommentRecyclerView.setVisibility(View.VISIBLE);
                if (count == 1){
                    listAll = new ArrayList<>();
                }
                listAll.addAll(data);
                adapter.setList(listAll);
            } else {
                mCommentTextView.setVisibility(View.VISIBLE);
                mCommentRecyclerView.setVisibility(View.GONE);
            }
        }
    }
}
