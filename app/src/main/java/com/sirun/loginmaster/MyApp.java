package com.sirun.loginmaster;

import android.app.Application;
import android.content.Context;

import com.sirun.httputil.HttpUtils;
import com.sirun.loginmodules.config.Urls;

/**
 * @author LiuShiKai
 * @date 2018/12/28 13:41
 * @describe
 */

public class MyApp extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        HttpUtils.setContext(this);

        Urls.switchUrl(0);
    }
}
