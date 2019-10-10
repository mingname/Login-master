package com.sirun.loginmodules.entity.request;

/**
 * Created by xueqiaoming on 2019/1/23.
 */

public class LoginReq {
    private String userName;
    private String passWord;
    private String deviceType;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}
