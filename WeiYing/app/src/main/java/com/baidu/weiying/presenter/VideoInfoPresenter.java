package com.baidu.weiying.presenter;

import com.baidu.weiying.modle.ITotalModle;
import com.baidu.weiying.modle.TotalModle;
import com.baidu.weiying.view.bean.VideoInfoSuperClass;
import com.baidu.weiying.view.ifragments.IVideoInfoView;

/**
 * 视频详情Presenter层
 */

public class VideoInfoPresenter implements IVideoInfoPresenter {
    private IVideoInfoView iVideoInfoView;
    private ITotalModle iTotalModle;

    public VideoInfoPresenter(IVideoInfoView iVideoInfoView) {
        this.iVideoInfoView = iVideoInfoView;
        iTotalModle = new TotalModle();
    }

    @Override
    public void getVideoInfo(String path, String mediaId) {
        iTotalModle.getVideoInfo(path,mediaId,this);
    }

    @Override
    public void onFailed(String str) {
        if (iVideoInfoView != null){
            iVideoInfoView.onFailed(str);
        }
    }

    @Override
    public void onSuccess(VideoInfoSuperClass videoInfoSuperClass) {
        if (iVideoInfoView != null){
            iVideoInfoView.onSuccess(videoInfoSuperClass);
        }
    }

    @Override
    public void onDestory() {
        if (iVideoInfoView != null){
            iVideoInfoView = null;
        }
    }
}
