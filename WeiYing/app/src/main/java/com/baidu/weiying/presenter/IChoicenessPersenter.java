package com.baidu.weiying.presenter;

import com.baidu.weiying.view.bean.HomePageSuperClass;

import java.util.List;

/**
 * Created by lenovo on 2018/5/21.
 */

public interface IChoicenessPersenter {
    void onSuccess(HomePageSuperClass.RetBean data);
    void onFailed(String s);
    void getChoiceness();
    void onDestory();
}
