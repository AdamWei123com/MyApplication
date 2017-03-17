package aw.a66ka.cn.myapplication.http;


import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by AdamWei on 2017/3/17.
 * Emial:972663233@qq.com
 */

public interface httpPost {

    @POST("users/{user}/repos")
    Call<httpPostContext> userPost( @Path("user") String user);

    @POST("users/{user}/repos")
    Call<httpPostContext> listRepos(@Path("user") String user);


}
