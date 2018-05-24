package com.baidu.weiying.presenter;

import com.baidu.weiying.modle.TotalModle;
import com.baidu.weiying.view.bean.DissertationSuperClass;
import com.baidu.weiying.view.ifragments.IDissertationFragment;

/**
 * Created by Administrator on 2018/5/22.
 */

public class DissertationPersenter implements IDissertationPersenter {
    private IDissertationFragment iDissertationFragment;
    private TotalModle totalModle;

    public DissertationPersenter(IDissertationFragment iDissertationFragment) {
        this.iDissertationFragment = iDissertationFragment;
          totalModle = new TotalModle();
    }


    @Override
    public void onSuccess(DissertationSuperClass.RetBean data) {
        if (iDissertationFragment!=null){
            iDissertationFragment.onSucess(data);

        }
    }

    @Override
    public void onFailed(String s) {
        if (iDissertationFragment!=null){
            iDissertationFragment.onFailed(s);

        }
    }

    @Override
    public void getDissertation() {
        totalModle.getDissertation(this);
    }


    @Override
    public void onDestory() {
        if (iDissertationFragment!=null){
            iDissertationFragment=null;
        }

    }
}
