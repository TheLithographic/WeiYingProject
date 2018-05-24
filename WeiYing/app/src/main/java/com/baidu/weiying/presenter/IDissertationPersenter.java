package com.baidu.weiying.presenter;

import com.baidu.weiying.view.bean.DissertationSuperClass;
import com.baidu.weiying.view.bean.HomePageSuperClass;

/**
 * Created by Administrator on 2018/5/22.
 */

public interface IDissertationPersenter {
    void onSuccess(DissertationSuperClass.RetBean data);
    void onFailed(String s);
    void getDissertation();
    void onDestory();
}
