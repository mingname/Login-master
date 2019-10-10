package com.sirun.loginmodules.entity;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * @author xueqiaoming
 * @date 2018/12/18
 * @describe 登录实体类(文章中的LoginInfo)
 */

public class LoginEntity implements Serializable{

    /**
     * loginResult : true
     * user : {"userId":1623,"userName":"test","passWord":"123456","deviceType":1,"phoneNum":"18593164984","headIcon":"http://zotyev2-pro.oss-cn-hangzhou.aliyuncs.com/usericon/a37a2daa892860ed725652922994ea5a.jpg","verifyType":null,"pin":1234,"gesturePwd":null,"squaredPwd":null,"sex":null,"email":null,"trueName":"王凯","idCard":"130185199111184033","createDate":1544149841000,"nickName":"test","area":null,"vin":null,"powers":null,"defaultAuth":1,"appType":1,"phoneUUID":null,"userType":null,"serialNumber":null,"frontImgUrl":null,"contraryImgUrl":null,"personImgUrl":null,"userStep":2}
     * vehicle : {"id":1821,"vin":"LJTESTA4520181116","color":"清晨紫","userId":null,"country":"中国","license":"湘B9HS25","phoneNumber":"18593164984","brand":"汉腾A45","model":"A45","fuel":"汽油","createDate":null,"simId":"14600180554","isActivity":null,"tripsStatus":1,"flag":null}
     */

    private boolean loginResult;
    private UserInfoEntity user;
    private VehicleInfoEntity vehicle;
    private String failureReason;

    public boolean isLoginResult() {
        return loginResult;
    }

    public void setLoginResult(boolean loginResult) {
        this.loginResult = loginResult;
    }

    public UserInfoEntity getUser() {
        return user;
    }

    public void setUser(UserInfoEntity user) {
        this.user = user;
    }

    public VehicleInfoEntity getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleInfoEntity vehicle) {
        this.vehicle = vehicle;
    }

    public String getFailureReason() {
        return TextUtils.isEmpty(failureReason) ? "" : failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "loginResult=" + loginResult +
                ", user=" + user +
                ", vehicle=" + vehicle +
                ", failureReason='" + failureReason + '\'' +
                '}';
    }
}

