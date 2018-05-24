package com.baidu.weiying.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.baidu.weiying.R;
import com.baidu.weiying.view.activity.VideoInfoActivity;
import com.baidu.weiying.view.adapters.IntroAdapter;
import com.baidu.weiying.view.base.BaseFragment;
import com.baidu.weiying.view.bean.VideoInfoSuperClass;

import java.util.List;

/**
 * 简介
 */

public class IntroFragment extends BaseFragment {
    private TextView mIntroTextView;
    private RecyclerView mIntroRecyclerView;
    private TextView mIntroTextViewOnClick;
    private boolean flag = true;
    private VideoInfoSuperClass.RetBean ret;
    private IntroAdapter adapter;
    private List<VideoInfoSuperClass.RetBean.ListBean.ChildListBean> childList;

    @Override
    protected int getLayoutId() {
        return R.layout.intro_fragment;
    }

    @Override
    protected Object getPresenter() {
        return null;
    }

    @Override
    protected void initView(View view) {

        mIntroTextView = (TextView) view.findViewById(R.id.intro_textView);
        mIntroRecyclerView = (RecyclerView) view.findViewById(R.id.intro_recyclerView);
        mIntroTextViewOnClick = (TextView) view.findViewById(R.id.intro_textViewOnClick);
        adapter = new IntroAdapter(getContext());

    }

    @Override
    protected void getData() {
        Bundle bundle = getArguments();
        ret = (VideoInfoSuperClass.RetBean) bundle.getSerializable("ret");
        String dir = "导演：" + ret.getDirector();
        String act = "主演：" + ret.getActors();
        String des = dir + "\n" + act + "\n" + "简介：" + ret.getDescription();
        mIntroTextView.setText(des);
        mIntroTextViewOnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean b = !flag;
                if (b){
                    flag = true;
                    mIntroTextViewOnClick.setText("展开");
                    mIntroTextView.setLines(3);
                }else {
                    flag = false;
                    mIntroTextViewOnClick.setText("收起");
                    mIntroTextView.setSingleLine(false);
                }
            }
        });

        mIntroRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        mIntroRecyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new IntroAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getContext(),VideoInfoActivity.class);
                intent.putExtra("title",childList.get(position).getTitle());
                intent.putExtra("dataId",childList.get(position).getDataId());
                intent.putExtra("pic",childList.get(position).getPic());
                intent.putExtra("airTime",childList.get(position).getAirTime());
                intent.putExtra("score",childList.get(position).getScore());
                startActivity(intent);
                getActivity().finish();
            }
        });

        getPresentationData();
    }

    private void getPresentationData() {
        childList = ret.getList().get(0).getChildList();
        if (childList != null){
            adapter.setList(childList);
        }
    }
}
