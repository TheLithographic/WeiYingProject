package com.baidu.weiying.modle;

import com.baidu.weiying.presenter.IChoicenessPersenter;
import com.baidu.weiying.presenter.ICommentPresenter;
import com.baidu.weiying.presenter.IDiscoverPresenter;
import com.baidu.weiying.presenter.IVideoInfoPresenter;

/**
 * Modle层接口
 */

public interface ITotalModle {
    //精选
    void getChoiceness(IChoicenessPersenter iChoicenessPersenter);
    //发现
    void getDiscover(String path, String catalogId, String pnum, IDiscoverPresenter iDiscoverPresenter);
    //视频详情
    void getVideoInfo(String path, String mediaId, IVideoInfoPresenter iVideoInfoPresenter);
    //评论
    void getComment(String path, String mediaId, String pnum, ICommentPresenter iCommentPresenter);
}
