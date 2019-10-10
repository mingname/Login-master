package com.sirun.loginmodules.Intefice;

import com.sirun.httputil.MyResponse;
import com.sirun.loginmodules.entity.LoginEntity;
import com.sirun.loginmodules.entity.request.LoginReq;

/**
 * Created by xueqiaoming on 2019/1/23.
 */

public interface ICenterTier {
        void login(LoginReq loginEntity, UCallBack<MyResponse> mCallBack);
}
