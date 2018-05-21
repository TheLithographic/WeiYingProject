package com.baidu.weiying.modle;

import com.baidu.weiying.presenter.IChoicenessPersenter;
import com.baidu.weiying.view.api.Api;
import com.baidu.weiying.view.api.ApiService;
import com.baidu.weiying.view.bean.HomePageSuperClass;
import com.baidu.weiying.view.utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

/**
 * Modle类
 */

public class TotalModle implements ITotalModle{

    @Override
    public void getChoiceness(final IChoicenessPersenter iChoicenessPersenter) {
        RetrofitUtils inData = RetrofitUtils.getInData();
        ApiService retrofit = inData.getRetrofit(Api.HOST_NAME, ApiService.class);
        Flowable<HomePageSuperClass> choiceeness = retrofit.getChoiceeness();
        choiceeness.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<HomePageSuperClass>() {
                    @Override
                    public void onNext(HomePageSuperClass homePageSuperClass) {
                        HomePageSuperClass.RetBean ret = homePageSuperClass.getRet();
                        if (iChoicenessPersenter!=null){
                            iChoicenessPersenter.onSuccess(ret);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        if (iChoicenessPersenter!=null){
                            iChoicenessPersenter.onFailed(t.getMessage());
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
