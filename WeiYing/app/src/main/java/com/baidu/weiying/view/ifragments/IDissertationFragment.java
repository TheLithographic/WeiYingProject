package com.baidu.weiying.view.ifragments;

import com.baidu.weiying.view.bean.DissertationSuperClass;
import com.baidu.weiying.view.bean.HomePageSuperClass;

/**
 * Created by Administrator on 2018/5/22.
 * 专题
 */

public interface IDissertationFragment {
    void onSucess(DissertationSuperClass.RetBean data);
    void onFailed(String s);
}
