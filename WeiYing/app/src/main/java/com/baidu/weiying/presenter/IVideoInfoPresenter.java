package com.baidu.weiying.presenter;

import com.baidu.weiying.view.bean.VideoInfoSuperClass;

/**
 * 视频详情的Presenter层的接口
 */

public interface IVideoInfoPresenter {

    void getVideoInfo(String path, String mediaId);

    void onFailed(String str);

    void onSuccess(VideoInfoSuperClass videoInfoSuperClass);

    void onDestory();

}
