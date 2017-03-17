package aw.a66ka.cn.myapplication.http;

import android.app.Application;
import android.content.Context;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;

import aw.a66ka.cn.myapplication.http.cookie.PersistentCookieStore;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by AdamWei on 2017/3/16.
 * Emial:972663233@qq.com
 */

public class httpSeting extends Application
{
    OkHttpClient okhttp;
    Retrofit retrofit;
    CookieHandler cookiehandler;
    public httpSeting ( Context context){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://aw.66ka.cn/")
                .client (okhttp)
                .build();

        httpPost service = retrofit.create(httpPost.class);

        cookiehandler= new CookieManager (new PersistentCookieStore (context), CookiePolicy.ACCEPT_ALL);
        okhttp=new OkHttpClient.Builder()
                .cookieJar(new JavaNetCookieJar (cookiehandler)).build();
    }


}
