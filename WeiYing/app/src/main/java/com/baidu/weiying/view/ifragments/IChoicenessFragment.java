package com.baidu.weiying.view.ifragments;

import android.view.View;

import com.baidu.weiying.view.bean.HomePageSuperClass;

import java.util.List;

/**
 * Created by lenovo on 2018/5/21.
 */

public interface IChoicenessFragment {
    void onSucess(HomePageSuperClass.RetBean data);
    void onFailed(String s);
}
