package com.sirun.loginmodules.entity;

import android.text.TextUtils;

import java.io.Serializable;


public class UserInfoEntity implements Serializable{

    private String userId;
    private String userName;
    private String passWord;
    private String deviceType;
    private String phoneNum;
    private String headIcon;
    private String verifyType;
    private String pin;
    private int sex;
    private String email;
    private String trueName;
    private String idCard;
    private String createDate;
    private String nickName;
    private String area;
    private String vin;
    private String powers;
    private String squaredPwd;
    private String gesturePwd;
    private int defaultAuth;
    private int userStep;

    public String getUserId() {
        return TextUtils.isEmpty(userId) ? "" : userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVin() {
        return TextUtils.isEmpty(vin) ? "" : vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public String getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getGesturePwd() {
        return gesturePwd;
    }

    public void setGesturePwd(String gesturePwd) {
        this.gesturePwd = gesturePwd;
    }

    public String getSquaredPwd() {
        return squaredPwd;
    }

    public void setSquaredPwd(String squaredPwd) {
        this.squaredPwd = squaredPwd;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public int getDefaultAuth() {
        return defaultAuth;
    }

    public void setDefaultAuth(int defaultAuth) {
        this.defaultAuth = defaultAuth;
    }

    public int getUserStep() {
        return userStep;
    }

    public void setUserStep(int userStep) {
        this.userStep = userStep;
    }

    @Override
    public String toString() {
        return "UserInfoEntity{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", headIcon='" + headIcon + '\'' +
                ", verifyType='" + verifyType + '\'' +
                ", pin='" + pin + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", trueName='" + trueName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", createDate='" + createDate + '\'' +
                ", nickName='" + nickName + '\'' +
                ", area='" + area + '\'' +
                ", vin='" + vin + '\'' +
                ", powers='" + powers + '\'' +
                ", squaredPwd='" + squaredPwd + '\'' +
                ", gesturePwd='" + gesturePwd + '\'' +
                ", defaultAuth=" + defaultAuth +
                ", userStep=" + userStep +
                '}';
    }
}

