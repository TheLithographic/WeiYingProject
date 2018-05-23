package com.baidu.weiying.view.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.baidu.weiying.R;
import com.baidu.weiying.view.base.BaseFragment;

/**
 * 评论
 */

public class CommentFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.comment_fragment;
    }

    @Override
    protected Object getPresenter() {
        return null;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void getData() {
        Bundle bundle = getArguments();
        String mediaId = bundle.getString("mediaId");

    }
}
