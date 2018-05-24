package com.baidu.weiying.presenter;

import com.baidu.weiying.view.bean.CommentSuperClass;

import java.util.List;

/**
 * 评论Presenter层的接口
 */

public interface ICommentPresenter {
    void getComment(String path, String mediaId,String pnum);

    void onFailed(String str);

    void onSuccess(List<CommentSuperClass.RetBean.ListBean> data);

    void onDestory();
}
