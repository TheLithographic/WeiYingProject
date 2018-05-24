package com.baidu.weiying.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.presenter.VideoInfoPresenter;
import com.baidu.weiying.view.api.Api;
import com.baidu.weiying.view.base.BaseActivity;
import com.baidu.weiying.view.bean.VideoInfoSuperClass;
import com.baidu.weiying.view.fragments.CommentFragment;
import com.baidu.weiying.view.fragments.IntroFragment;
import com.baidu.weiying.view.ifragments.IVideoInfoView;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class VideoInfoActivity extends BaseActivity<VideoInfoPresenter> implements View.OnClickListener, IVideoInfoView {

    private ImageView mVideoInfoBack;
    private TextView mVideoInfoTitle;
    private ImageView mVideoInfoCollection;
    private JCVideoPlayerStandard mVideoplayer;
    private VideoInfoSuperClass.RetBean ret;
    private TabLayout mVideoInfoTabLayout;
    private ViewPager mVideoInfoViewPager;
    private String[] strings = {"简介","评论"};
    private List<Fragment> list;
    private IntroFragment introFragment;
    private CommentFragment commentFragment;
    private String dataId;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_video_info;
    }

    @Override
    protected VideoInfoPresenter getPresenter() {
        presenter = new VideoInfoPresenter(this);
        return presenter;
    }

    @Override
    protected void initView() {

        mVideoInfoBack = (ImageView) findViewById(R.id.video_info_back);
        mVideoInfoBack.setOnClickListener(this);
        mVideoInfoTitle = (TextView) findViewById(R.id.video_info_title);
        mVideoInfoCollection = (ImageView) findViewById(R.id.video_info_collection);
        mVideoInfoCollection.setOnClickListener(this);
        mVideoplayer = (JCVideoPlayerStandard) findViewById(R.id.videoplayer);
        mVideoInfoTabLayout = (TabLayout) findViewById(R.id.video_info_tabLayout);
        mVideoInfoViewPager = (ViewPager) findViewById(R.id.video_info_viewPager);
        list = new ArrayList<>();
        introFragment = new IntroFragment();
        commentFragment = new CommentFragment();
    }

    @Override
    protected void getData() {
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        dataId = intent.getStringExtra("dataId");
        String pic = intent.getStringExtra("pic");
        String airTime = intent.getStringExtra("airTime");
        String score = intent.getStringExtra("score");
        mVideoInfoTitle.setText(title);

        mVideoplayer.thumbImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mVideoplayer.backButton.setVisibility(View.GONE);
        mVideoplayer.titleTextView.setVisibility(View.GONE);
        mVideoplayer.tinyBackImageView.setVisibility(View.GONE);

        presenter.getVideoInfo(Api.HOST_NAME, dataId);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.video_info_back:
                finish();
                break;
            case R.id.video_info_collection:
                break;
        }
    }

    @Override
    public void onFailed(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(VideoInfoSuperClass videoInfoSuperClass) {
        ret = videoInfoSuperClass.getRet();
        if (!TextUtils.isEmpty(ret.getPic()))
            Glide.with(this)
                    .load(ret.getPic())
                    .into(mVideoplayer.thumbImageView);
        if (!TextUtils.isEmpty(getVideoUrl())) {
            String videoUrl = getVideoUrl();
            String[] split = videoUrl.split("m3u8");
            mVideoplayer.setUp(split[0] + "mp4"
                    , JCVideoPlayerStandard.SCREEN_LAYOUT_LIST, ret.getTitle());
            mVideoplayer.onClick(mVideoplayer.thumbImageView);
        }

        //存值
        Bundle bundle = new Bundle();
        bundle.putSerializable("ret",ret);
        bundle.putString("mediaId",dataId);
        introFragment.setArguments(bundle);
        commentFragment.setArguments(bundle);

        //把fragment添加到集合中
        list.add(introFragment);
        list.add(commentFragment);
        //把标题添加到TabLayout里
        for (int i = 0; i < strings.length; i++) {
            mVideoInfoTabLayout.addTab(mVideoInfoTabLayout.newTab().setText(strings[i]));
        }
        //设置viewpager适配器
        mVideoInfoViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list != null ? list.size() : 0;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return strings[position];
            }
        });
        //设置viewpager和tablayout联动
        mVideoInfoTabLayout.setupWithViewPager(mVideoInfoViewPager);
    }

    public String getVideoUrl() {
        if (!TextUtils.isEmpty(ret.getHDURL()))
            return ret.getHDURL();
        else if (!TextUtils.isEmpty(ret.getSDURL()))
            return ret.getSDURL();
        else if (!TextUtils.isEmpty(ret.getSmoothURL()))
            return ret.getSmoothURL();
        else
            return "";
    }

    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestory();
    }
}
