package com.monster.monstersport.http.api;


import com.monster.monstersport.bean.ChapterBean;
import com.monster.monstersport.bean.ChapterListBean;
import com.monster.monstersport.http.BaseHttpResult;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @author zhzy
 * @date 2017/11/1
 */
public interface IHyangApi {
    String STORY_ID = "8aada6395ab2985c015afaeb0a9c0619";
    String BASE_URL = "https://app.xhhread.com/";

    /* 章节目录 */
    @GET("/chapter/searchChapterListVO.i?storyid=" + STORY_ID + "&pageSize=10000")
    Observable<BaseHttpResult<ChapterListBean>> searchChapterListVO();

    /* 获取章节内容*/
    @GET("/chapter/getChapterReadById.i")
    Observable<ChapterBean> getChapterReadById(@Query("chapterid") String chapterid);


    /* 书籍特定章的上一章 */
    @GET("/chapter/getPreChapterReadById.i")
    Observable<BaseHttpResult<ChapterBean>> getPreChapterReadById(@Query("chapterid") String chapterid);


    /* 书籍特定章的下一章 */
    @GET("/chapter/getNextChapterReadById.i")
    Observable<BaseHttpResult<ChapterBean>> getNextChapterReadById(@Query("chapterid") String chapterid);


}
