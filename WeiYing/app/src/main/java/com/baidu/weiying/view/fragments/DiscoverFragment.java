package com.baidu.weiying.view.fragments;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.presenter.DiscoverPresenter;
import com.baidu.weiying.view.adapters.CardAdapter;
import com.baidu.weiying.view.api.Api;
import com.baidu.weiying.view.base.BaseFragment;
import com.baidu.weiying.view.bean.DiscoverSuperClass;
import com.baidu.weiying.view.ifragments.IDiscoverView;
import com.baidu.weiying.view.slidecard.CardConfig;
import com.baidu.weiying.view.slidecard.CardItemTouchCallBack;
import com.baidu.weiying.view.slidecard.SwipeCardLayoutManager;
import com.baidu.weiying.view.slidecard.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 发现页面
 */

public class DiscoverFragment extends BaseFragment<DiscoverPresenter> implements IDiscoverView {
    private RecyclerView mRecyclerView;
    private CardAdapter mAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.discover_fragment;
    }

    @Override
    protected DiscoverPresenter getPresenter() {
        presenter = new DiscoverPresenter(this);
        return presenter;
    }

    @Override
    protected void initView(View view) {
        mRecyclerView = view.findViewById(R.id.discover_recyclerView);
        //初始化卡片的基本配置参数
        CardConfig.initConfig(getContext());
        mRecyclerView.setLayoutManager(new SwipeCardLayoutManager());
        mAdapter = new CardAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    protected void getData() {
        presenter.getDiscover(Api.HOST_NAME,"402834815584e463015584e539330016","8");
    }

    @Override
    public void onFailed(String str) {
        Toast.makeText(getContext(),str,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSuccess(List<DiscoverSuperClass.RetBean.ListBean> data) {
        if (data != null){
            //三步
            //1.创建ItemTuchCallBack
            CardItemTouchCallBack callBack = new CardItemTouchCallBack(mRecyclerView, mAdapter, data);
            //2.创建ItemTouchHelper并把callBack传进去
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callBack);
            //3.与RecyclerView关联起来
            itemTouchHelper.attachToRecyclerView(mRecyclerView);

            mAdapter.setList(data);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestory();
    }
}
