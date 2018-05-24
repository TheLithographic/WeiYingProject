package com.baidu.weiying.presenter;

import com.baidu.weiying.modle.ITotalModle;
import com.baidu.weiying.modle.TotalModle;
import com.baidu.weiying.view.bean.CommentSuperClass;
import com.baidu.weiying.view.ifragments.ICommentView;

import java.util.List;

/**
 * 评论Presenter层
 */

public class CommentPresenter implements ICommentPresenter {
    private ICommentView iCommentView;
    private ITotalModle iTotalModle;

    public CommentPresenter(ICommentView iCommentView) {
        this.iCommentView = iCommentView;
        iTotalModle = new TotalModle();
    }

    @Override
    public void getComment(String path, String mediaId, String pnum) {
        iTotalModle.getComment(path,mediaId,pnum,this);
    }

    @Override
    public void onFailed(String str) {
        if (iCommentView != null){
            iCommentView.onFailed(str);
        }
    }

    @Override
    public void onSuccess(List<CommentSuperClass.RetBean.ListBean> data) {
        if (iCommentView != null){
            iCommentView.onSuccess(data);
        }
    }

    @Override
    public void onDestory() {
        if (iCommentView != null){
            iCommentView = null;
        }
    }
}
