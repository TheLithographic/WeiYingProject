package com.baidu.weiying.view.fragments;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.baidu.weiying.R;
import com.baidu.weiying.view.adapters.CardAdapter;
import com.baidu.weiying.view.base.BaseFragment;
import com.baidu.weiying.view.slidecard.CardConfig;
import com.baidu.weiying.view.slidecard.CardItemTouchCallBack;
import com.baidu.weiying.view.slidecard.SwipeCardLayoutManager;
import com.baidu.weiying.view.slidecard.User;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import java.util.ArrayList;
import java.util.List;

/**
 * 发现页面
 */

public class DiscoverFragment extends BaseFragment {
    private RecyclerView mRecyclerView;
    private CardAdapter mAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.discover_fragment;
    }

    @Override
    protected Object getPresenter() {
        return null;
    }

    @Override
    protected void initView(View view) {
        mRecyclerView = view.findViewById(R.id.discover_recyclerView);
        //初始化卡片的基本配置参数
        CardConfig.initConfig(getContext());
        mRecyclerView.setLayoutManager(new SwipeCardLayoutManager());
        mAdapter = new CardAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);

        List<User> datas = new ArrayList<>();
        datas.add(new User(R.mipmap.back, "名字1", "其他1"));
        datas.add(new User(R.mipmap.card_bg, "名字2", "其他2"));
        datas.add(new User(R.mipmap.bg_colorful, "名字3", "其他3"));
        datas.add(new User(R.mipmap.found_select, "名字4", "其他4"));
        datas.add(new User(R.mipmap.fancy_select, "名字5", "其他5"));
        datas.add(new User(R.mipmap.search_history_clear, "名字6", "其他6"));
        datas.add(new User(R.mipmap.search_clear, "名字7", "其他7"));
        datas.add(new User(R.mipmap.shadow_left, "名字8", "其他8"));

        //三步
        //1.创建ItemTuchCallBack
        CardItemTouchCallBack callBack = new CardItemTouchCallBack(mRecyclerView, mAdapter, datas);
        //2.创建ItemTouchHelper并把callBack传进去
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callBack);
        //3.与RecyclerView关联起来
        itemTouchHelper.attachToRecyclerView(mRecyclerView);

        mAdapter.setmData(datas);
    }

    @Override
    protected void getData() {

    }
}
