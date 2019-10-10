package com.sirun.loginmodules.entity;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * @author xueqiaoming
 * @date 2018/12/18
 * @describe 登录实体类(文章中的LoginInfo)
 */

public class ForgetPassEntity implements Serializable{


    private String result;
    private String srresult;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSrresult() {
        return srresult;
    }

    public void setSrresult(String srresult) {
        this.srresult = srresult;
    }

    @Override
    public String toString() {
        return "ForgetPassEntity{" +
                "result='" + result + '\'' +
                ", srresult='" + srresult + '\'' +
                '}';
    }
}

