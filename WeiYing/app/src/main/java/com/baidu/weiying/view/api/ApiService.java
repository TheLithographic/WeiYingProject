package com.baidu.weiying.view.api;

import com.baidu.weiying.view.bean.CommentSuperClass;
import com.baidu.weiying.view.bean.DiscoverSuperClass;
import com.baidu.weiying.view.bean.DissertationSuperClass;
import com.baidu.weiying.view.bean.HomePageSuperClass;
import com.baidu.weiying.view.bean.VideoInfoSuperClass;

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
    //专题地址
    @GET("/front/homePageApi/homePage.do")
    Flowable<DissertationSuperClass> getDissertation();
    //视频详情
    @GET("/front/videoDetailApi/videoDetail.do")
    Flowable<VideoInfoSuperClass> getVideoInfo(@Query("mediaId")String mediaId);
    //评论
    @GET("/front/Commentary/getCommentList.do")
    Flowable<CommentSuperClass> getComment(@Query("mediaId")String mediaId, @Query("pnum")String pnum);
}
