package com.sirun.loginmodules.Intefice;

import com.sirun.httputil.MyResponse;
import com.sirun.loginmodules.entity.LoginEntity;

/**
 * Created by xueqiaoming on 2018/12/25.
 */

public interface UCallBack<T> {
    public void success(MyResponse<T> msg);
    public void fail(String msg);
}
