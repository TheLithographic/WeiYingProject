package com.baidu.weiying.view.api;

import com.baidu.weiying.view.bean.DiscoverSuperClass;
import com.baidu.weiying.view.bean.HomePageSuperClass;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 实现类
 */

public interface ApiService {
    //精选地址
    @GET("/front/homePageApi/homePage.do")
    Flowable<HomePageSuperClass> getChoiceeness();
    //发现地址
    @GET("/front/columns/getVideoList.do")
    Flowable<DiscoverSuperClass> getDiscover(@Query("catalogId")String catalogId, @Query("pnum")String pnum);
}
