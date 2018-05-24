package com.baidu.weiying.view.ifragments;

import com.baidu.weiying.view.bean.CommentSuperClass;

import java.util.List;

/**
 * 评论的View层的接口
 */

public interface ICommentView {
    void onFailed(String str);

    void onSuccess(List<CommentSuperClass.RetBean.ListBean> data);
}
