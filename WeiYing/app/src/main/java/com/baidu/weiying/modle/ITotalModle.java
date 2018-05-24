package com.baidu.weiying.modle;

import com.baidu.weiying.presenter.IChoicenessPersenter;
import com.baidu.weiying.presenter.ICommentPresenter;
import com.baidu.weiying.presenter.IDiscoverPresenter;
<<<<<<< HEAD
import com.baidu.weiying.presenter.IDissertationPersenter;
=======
import com.baidu.weiying.presenter.IVideoInfoPresenter;
>>>>>>> b17dfe94f89d4738a40b6c5ef53e27e0c4d998e4

/**
 * Modle层接口
 */

public interface ITotalModle {
    //精选
    void getChoiceness(IChoicenessPersenter iChoicenessPersenter);
    //发现
    void getDiscover(String path, String catalogId, String pnum, IDiscoverPresenter iDiscoverPresenter);
<<<<<<< HEAD

     void getDissertation(IDissertationPersenter iDissertationPersenter);

=======
    //视频详情
    void getVideoInfo(String path, String mediaId, IVideoInfoPresenter iVideoInfoPresenter);
    //评论
    void getComment(String path, String mediaId, String pnum, ICommentPresenter iCommentPresenter);
>>>>>>> b17dfe94f89d4738a40b6c5ef53e27e0c4d998e4
}
