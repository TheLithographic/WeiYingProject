package com.baidu.weiying.view.api;

import com.baidu.weiying.view.bean.HomePageSuperClass;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * 实现类
 */

public interface ApiService {
    @GET("/front/homePageApi/homePage.do")
    Flowable<HomePageSuperClass> getChoiceeness();
}
