package com.baidu.weiying.presenter;

import com.baidu.weiying.view.bean.DiscoverSuperClass;

import java.util.List;

/**
 * 发现的Presenter层的接口
 */

public interface IDiscoverPresenter {
    void getDiscover(String path, String catalogId, String pnum);

    void onFailed(String str);

    void onSuccess(List<DiscoverSuperClass.RetBean.ListBean> data);

    void onDestory();
}
