package com.baidu.weiying.modle;

import com.baidu.weiying.presenter.IChoicenessPersenter;
import com.baidu.weiying.presenter.IDiscoverPresenter;
import com.baidu.weiying.presenter.IDissertationPersenter;

/**
 * Modle层接口
 */

public interface ITotalModle {
    //精选
    void getChoiceness(IChoicenessPersenter iChoicenessPersenter);
    //发现
    void getDiscover(String path, String catalogId, String pnum, IDiscoverPresenter iDiscoverPresenter);

     void getDissertation(IDissertationPersenter iDissertationPersenter);

}
