package com.baidu.weiying.view.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.presenter.ChoicenessPersenter;
import com.baidu.weiying.view.adapters.MyChoicenessAdapter;
import com.baidu.weiying.view.base.BaseFragment;
import com.baidu.weiying.view.bean.HomePageSuperClass;
import com.baidu.weiying.view.ifragments.IChoicenessFragment;
import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * 精选页面
 */

public class ChoicenessFragment extends BaseFragment<ChoicenessPersenter> implements IChoicenessFragment, OnBannerListener {
    private List<String> mImgUrls;
    private ChoicenessPersenter persenter;
    private HomePageSuperClass.RetBean data;
    private RecyclerView mRlv;
    private Banner banner;
    private ArrayList<String> list_path;
    private ArrayList<String> list_title;
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
        mRlv = view.findViewById(R.id.choiceness_rlv);
        mImgUrls = new ArrayList<>();
        banner = (Banner) view.findViewById(R.id.banner);
        //放图片地址的集合
        list_path = new ArrayList<>();
        //放标题的集合
        list_title = new ArrayList<>();

//        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg");
//        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg");
//        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg");
//        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg");

    }

    @Override
    protected void getData() {
        persenter.getChoiceness();
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

            list_path.add(pic);
            list_path.add(pic1);
            list_path.add(pic2);
            list_path.add(pic3);
            list_path.add(pic4);

        list_title.add("好好学习");
        list_title.add("天天向上");
        list_title.add("热爱劳动");
        list_title.add("不搞对象");
        list_title.add("哈哈");
        //设置内置样式，共有六种可以点入方法内逐一体验使用。
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        //设置图片加载器，图片加载器在下方
        banner.setImageLoader(new MyLoader());
        //设置图片网址或地址的集合
        banner.setImages(list_path);
        //设置轮播的动画效果，内含多种特效，可点入方法内查找后内逐一体验
        banner.setBannerAnimation(Transformer.Default);
        //设置轮播图的标题集合
        banner.setBannerTitles(list_title);
        //设置轮播间隔时间
        banner.setDelayTime(3000);
        //设置是否为自动轮播，默认是“是”。
        banner.isAutoPlay(true);
        //设置指示器的位置，小点点，左中右。
        banner.setIndicatorGravity(BannerConfig.CENTER)
                //以上内容都可写成链式布局，这是轮播图的监听。比较重要。方法在下面。
                .setOnBannerListener(this)
                //必须最后调用的方法，启动轮播图。
                .start();


    }


    //自定义的图片加载器
    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String) path).into(imageView);
        }
    }
    @Override
    public void onFailed(String s) {
        Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnBannerClick(int position) {

    }
}
