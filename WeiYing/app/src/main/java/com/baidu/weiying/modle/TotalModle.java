package com.baidu.weiying.modle;

import com.baidu.weiying.presenter.IChoicenessPersenter;
import com.baidu.weiying.presenter.IDiscoverPresenter;
import com.baidu.weiying.presenter.IVideoInfoPresenter;
import com.baidu.weiying.view.api.Api;
import com.baidu.weiying.view.api.ApiService;
import com.baidu.weiying.view.bean.DiscoverSuperClass;
import com.baidu.weiying.view.bean.HomePageSuperClass;
import com.baidu.weiying.view.bean.VideoInfoSuperClass;
import com.baidu.weiying.view.utils.RetrofitUtils;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;
import io.reactivex.subscribers.DisposableSubscriber;

/**
 * Modle类
 */

public class TotalModle implements ITotalModle{

    private RetrofitUtils retrofitUtils;

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

    @Override
    public void getDiscover(String path, String catalogId, String pnum, final IDiscoverPresenter iDiscoverPresenter) {
        retrofitUtils = RetrofitUtils.getInData();
        ApiService apiService = retrofitUtils.getRetrofit(path, ApiService.class);
        Flowable<DiscoverSuperClass> flowable = apiService.getDiscover(catalogId, pnum);
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DefaultSubscriber<DiscoverSuperClass>() {
                    @Override
                    public void onNext(DiscoverSuperClass discoverSuperClass) {
                        DiscoverSuperClass.RetBean retBean = discoverSuperClass.getRet();
                        iDiscoverPresenter.onSuccess(retBean.getList());
                    }

                    @Override
                    public void onError(Throwable t) {
                        iDiscoverPresenter.onFailed(t.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getVideoInfo(String path, String mediaId, final IVideoInfoPresenter iVideoInfoPresenter) {
        retrofitUtils = RetrofitUtils.getInData();
        ApiService apiService = retrofitUtils.getRetrofit(path, ApiService.class);
        Flowable<VideoInfoSuperClass> flowable = apiService.getVideoInfo(mediaId);
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DefaultSubscriber<VideoInfoSuperClass>() {
                    @Override
                    public void onNext(VideoInfoSuperClass videoInfoSuperClass) {
                        iVideoInfoPresenter.onSuccess(videoInfoSuperClass);
                    }

                    @Override
                    public void onError(Throwable t) {
                        iVideoInfoPresenter.onFailed(t.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
