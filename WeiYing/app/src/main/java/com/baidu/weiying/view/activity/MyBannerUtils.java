package com.baidu.weiying.view.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.youth.banner.Banner;

/**
 * Created by lenovo on 2018/5/23.
 */

public class MyBannerUtils extends Banner {
    public MyBannerUtils(Context context) {
        super(context);
    }

    public MyBannerUtils(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyBannerUtils(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(ev);
    }


}
