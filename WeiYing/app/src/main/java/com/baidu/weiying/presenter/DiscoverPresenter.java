package com.baidu.weiying.presenter;

import com.baidu.weiying.modle.ITotalModle;
import com.baidu.weiying.modle.TotalModle;
import com.baidu.weiying.view.bean.DiscoverSuperClass;
import com.baidu.weiying.view.ifragments.IDiscoverView;

import java.util.List;

/**
 * 发现类Presenter层
 */

public class DiscoverPresenter implements IDiscoverPresenter {
    private IDiscoverView iDiscoverView;
    private ITotalModle iTotalModle;

    public DiscoverPresenter(IDiscoverView iDiscoverView) {
        this.iDiscoverView = iDiscoverView;
        iTotalModle = new TotalModle();
    }

    @Override
    public void getDiscover(String path, String catalogId, String pnum) {
        iTotalModle.getDiscover(path,catalogId,pnum,this);
    }

    @Override
    public void onFailed(String str) {
        if (iDiscoverView != null){
            iDiscoverView.onFailed(str);
        }
    }

    @Override
    public void onSuccess(List<DiscoverSuperClass.RetBean.ListBean> data) {
        if (iDiscoverView != null){
            iDiscoverView.onSuccess(data);
        }
    }

    @Override
    public void onDestory() {
        if (iDiscoverView != null){
            iDiscoverView = null;
        }
    }
}
