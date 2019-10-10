package com.sirun.loginmodules.entity.resopnse;

import java.io.Serializable;

/**
 * Created by xueqiaoming on 2019/1/22.
 */

public class CheckCodeRes implements Serializable{
    private int result;
    private int srresult;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getSrresult() {
        return srresult;
    }

    public void setSrresult(int srresult) {
        this.srresult = srresult;
    }

    @Override
    public String toString() {
        return "CheckCodeRes{" +
                "result=" + result +
                ", srresult=" + srresult +
                '}';
    }
}
