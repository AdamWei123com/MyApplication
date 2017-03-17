package aw.a66ka.cn.myapplication.http;

/**
 * Created by AdamWei on 2017/3/17.
 * Emial:972663233@qq.com
 */

public class httpPostContext {
    public String userName = null;
    public String userPassword = null;
    public String Title = null;
    public String content = null;
    public String edificationCode = null;
    public String  search = null;
    public httpPostContext ( String search){
        this.search = search;
    }
    public httpPostContext ( String userName, String userPassword ) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
    public httpPostContext ( String title, String content, String edificationCode ){
        Title = title;
        this.content = content;
        this.edificationCode = edificationCode;
    }

}