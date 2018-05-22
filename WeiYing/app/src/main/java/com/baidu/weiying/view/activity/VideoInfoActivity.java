package com.baidu.weiying.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.presenter.VideoInfoPresenter;
import com.baidu.weiying.view.api.Api;
import com.baidu.weiying.view.base.BaseActivity;
import com.baidu.weiying.view.bean.VideoInfoSuperClass;
import com.baidu.weiying.view.ifragments.IVideoInfoView;
import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class VideoInfoActivity extends BaseActivity<VideoInfoPresenter> implements View.OnClickListener,IVideoInfoView {

    private ImageView mVideoInfoBack;
    private TextView mVideoInfoTitle;
    private ImageView mVideoInfoCollection;
    private JCVideoPlayerStandard mVideoplayer;
    private VideoInfoSuperClass.RetBean ret;

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
    }

    @Override
    protected void getData() {
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String dataId = intent.getStringExtra("dataId");
        String pic = intent.getStringExtra("pic");
        String airTime = intent.getStringExtra("airTime");
        String score = intent.getStringExtra("score");
        mVideoInfoTitle.setText(title);

        mVideoplayer.thumbImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mVideoplayer.backButton.setVisibility(View.GONE);
        mVideoplayer.titleTextView.setVisibility(View.GONE);
        mVideoplayer.tinyBackImageView.setVisibility(View.GONE);

        presenter.getVideoInfo(Api.HOST_NAME,dataId);
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
                    , JCVideoPlayerStandard.SCREEN_LAYOUT_LIST,ret.getTitle());
            mVideoplayer.onClick(mVideoplayer.thumbImageView);
        }
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
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestory();
    }
}
