package com.baidu.weiying.view.ifragments;

import com.baidu.weiying.view.bean.VideoInfoSuperClass;

/**
 * 视频详情的View层的接口
 */

public interface IVideoInfoView {
    void onFailed(String str);

    void onSuccess(VideoInfoSuperClass videoInfoSuperClass);
}
