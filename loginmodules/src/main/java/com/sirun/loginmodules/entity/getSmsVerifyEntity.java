package com.sirun.loginmodules.entity;

import java.io.Serializable;

/**
 * @author xueqiaoming
 * @date 2018/12/18
 * @describe 登录实体类(文章中的LoginInfo)
 */

public class getSmsVerifyEntity implements Serializable{


    private String smsVerifyResult;
    private String failureReason;

    public String getSmsVerifyResult() {
        return smsVerifyResult;
    }

    public void setSmsVerifyResult(String smsVerifyResult) {
        this.smsVerifyResult = smsVerifyResult;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    @Override
    public String toString() {
        return "getSmsVerifyEntity{" +
                "smsVerifyResult='" + smsVerifyResult + '\'' +
                ", failureReason='" + failureReason + '\'' +
                '}';
    }
}

