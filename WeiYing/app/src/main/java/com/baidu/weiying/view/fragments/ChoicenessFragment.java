package com.baidu.weiying.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.presenter.ChoicenessPersenter;
import com.baidu.weiying.view.MyView_Broadcast.AccordionTransformer;
import com.baidu.weiying.view.MyView_Broadcast.AutoBanner;
import com.baidu.weiying.view.adapters.MyChoicenessAdapter;
import com.baidu.weiying.view.base.BaseFragment;
import com.baidu.weiying.view.bean.HomePageSuperClass;
import com.baidu.weiying.view.ifragments.IChoicenessFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * 精选页面
 */

public class ChoicenessFragment extends BaseFragment<ChoicenessPersenter> implements AutoBanner.AutoBannerListener ,IChoicenessFragment{
    private AutoBanner mAutoBanner;
    private List<String> mImgUrls;
    private ChoicenessPersenter persenter;
    private HomePageSuperClass.RetBean data;
    private RecyclerView mRlv;

    @Override
    protected int getLayoutId() {
        return R.layout.choiceness_fragment;
    }

    @Override
    protected ChoicenessPersenter getPresenter() {
        persenter = new ChoicenessPersenter(this);
        return presenter;
    }

    @Override
    protected void initView(View view) {
        mAutoBanner = (AutoBanner) view.findViewById(R.id.auto_banner);
        mRlv = view.findViewById(R.id.choiceness_rlv);
        mImgUrls = new ArrayList<>();
    }

    @Override
    protected void getData() {
        persenter.getChoiceness();
    }

    @Override
    public void onClickListener(int postion) {

    }

    @Override
    public void onSucess(HomePageSuperClass.RetBean data) {
        this.data = data;
        List<HomePageSuperClass.RetBean.ListBean> list = data.getList();

            String pic = list.get(0).getChildList().get(0).getPic();
            String pic1 = list.get(1).getChildList().get(0).getPic();
            String pic2 = list.get(2).getChildList().get(0).getPic();
            String pic3 = list.get(6).getChildList().get(0).getPic();
            String pic4 = list.get(8).getChildList().get(0).getPic();

            mImgUrls.add(pic);
            mImgUrls.add(pic1);
            mImgUrls.add(pic2);
            mImgUrls.add(pic3);
            mImgUrls.add(pic4);

        mAutoBanner.load(mImgUrls).setOnAutoBannerListener(this).setAuto(3000).setAutoBannerAnimation(AccordionTransformer.class).display();

        //MyChoicenessAdapter adapter = new MyChoicenessAdapter();

    }

    @Override
    public void onFailed(String s) {
        Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
    }
}
