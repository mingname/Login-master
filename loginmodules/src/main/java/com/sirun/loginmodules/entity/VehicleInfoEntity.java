package com.sirun.loginmodules.entity;


import java.io.Serializable;

public class VehicleInfoEntity implements Serializable{
    private String vin;
    private String pin;
    private int isActivity;
    private String userId;
    private String color;
    private String country;
    private String license;
    private String phoneNumber;
    private String brand;
    private String model;
    private String fuel;
    private String createDate;
    private String simId;
    private String id;
    private int flag;

    private String iccid;
    private String imei;

    private String createTime;

    private String phoneNum;


    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getIsActivity() {
        return isActivity;
    }

    public void setIsActivity(int isActivity) {
        this.isActivity = isActivity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getSimId() {
        return simId;
    }

    public void setSimId(String simId) {
        this.simId = simId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "VehicleInfoEntity{" +
                "vin='" + vin + '\'' +
                ", pin='" + pin + '\'' +
                ", isActivity=" + isActivity +
                ", userId='" + userId + '\'' +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                ", license='" + license + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", createDate='" + createDate + '\'' +
                ", simId='" + simId + '\'' +
                ", id='" + id + '\'' +
                ", flag=" + flag +
                ", iccid='" + iccid + '\'' +
                ", imei='" + imei + '\'' +
                ", createTime='" + createTime + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
