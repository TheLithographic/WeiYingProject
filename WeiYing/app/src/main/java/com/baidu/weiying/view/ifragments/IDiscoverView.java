package com.baidu.weiying.view.ifragments;

import com.baidu.weiying.view.bean.DiscoverSuperClass;

import java.util.List;

/**
 * 发现的View层的接口
 */

public interface IDiscoverView {
    void onFailed(String str);

    void onSuccess(List<DiscoverSuperClass.RetBean.ListBean> data);
}
