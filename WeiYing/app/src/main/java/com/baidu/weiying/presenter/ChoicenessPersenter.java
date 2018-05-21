package com.baidu.weiying.presenter;

import com.baidu.weiying.modle.TotalModle;
import com.baidu.weiying.view.bean.HomePageSuperClass;
import com.baidu.weiying.view.ifragments.IChoicenessFragment;

import java.util.List;

/**
 * Created by lenovo on 2018/5/21.
 */

public class ChoicenessPersenter implements IChoicenessPersenter{
    IChoicenessFragment iChoicenessFragment;
    TotalModle modle;
    public ChoicenessPersenter(IChoicenessFragment iChoicenessFragment) {
        this.iChoicenessFragment = iChoicenessFragment;
        modle = new TotalModle();
    }

    @Override
    public void onSuccess(HomePageSuperClass.RetBean data) {
        if (iChoicenessFragment!=null){
            iChoicenessFragment.onSucess(data);
        }
    }

    @Override
    public void onFailed(String s) {
        if (iChoicenessFragment!=null){
            iChoicenessFragment.onFailed(s);
        }
    }

    @Override
    public void getChoiceness() {
        modle.getChoiceness(this);
    }

    @Override
    public void onDestory() {
        if (iChoicenessFragment!=null){
            iChoicenessFragment=null;
        }
    }
}
