package com.sirun.loginmodules.config;

import android.util.Log;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.sirun.httputil.HttpUtils;
import com.sirun.httputil.MyDefaultObserver;
import com.sirun.httputil.MyResponse;
import com.sirun.loginmodules.Intefice.ICenterTier;
import com.sirun.loginmodules.Intefice.UCallBack;
import com.sirun.loginmodules.MainActivity;
import com.sirun.loginmodules.entity.ForgetPassEntity;
import com.sirun.loginmodules.entity.LoginEntity;
import com.sirun.loginmodules.entity.getSmsVerifyEntity;
import com.sirun.loginmodules.entity.request.LoginReq;
import com.sirun.loginmodules.http.NetServiceRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xueqiaoming on 2019/1/21.
 */

public class LoginCorrelation implements ICenterTier{




    public LoginCorrelation() {

    }


    public static void setBaseUrl(String urls){
        Map<String, String> handleParams = new HashMap<>();
        HttpUtils.setDefaultBaseUrl(urls);
        HttpUtils.setDefaultHanderParams(handleParams);
    }

    /**
     * 服务器url、用户名、密码、设备类型、结果回调
     * @param userName
     * @param passWord
     * @param deviceType
     * @param mCallBack
     */
    public static void login(String userName,String passWord,String deviceType,UCallBack<MyResponse> mCallBack) {
        final UCallBack callBack; callBack = mCallBack;

        Map<String, Object> params = new HashMap<>();
        params.put("userName", userName);
        params.put("passWord", passWord);
        params.put("deviceType", deviceType);
        NetServiceRepository.getInstance().getDefaultNetService()
                .login(HttpUtils.getRequestBody(params))
                .compose(HttpUtils.<MyResponse<LoginEntity>>requestSchedulerHelper())
                //.retryWhen(new HttpCompensateFunction(3))
                .subscribe(new MyDefaultObserver<MyResponse<LoginEntity>>() {
                    @Override
                    public void onRequestResultSuccess(MyResponse<LoginEntity> response) {
                        Logger.d("登录成功:" + response.toString());
                        callBack.success(response);
                    }

                    @Override
                    public void onRequestError(Throwable throwable, String throwableMsg) {
                        Logger.d(throwableMsg);
                        callBack.fail(throwableMsg);
                    }
                });

    }


    /**
     * 修改密码
     * @param newPassWord
     * @param phoneNum
     * @param mCallBack
     */
    public static void forgetPass(String newPassWord,String phoneNum,UCallBack<MyResponse> mCallBack) {
        final UCallBack callBacks = mCallBack;
        Map<String, Object> params = new HashMap<>();
        params.put("passWord", newPassWord);
        NetServiceRepository.getInstance().getDefaultNetService()
                .forget(HttpUtils.getRequestBody(params),phoneNum)
                .compose(HttpUtils.<MyResponse<ForgetPassEntity>>requestSchedulerHelper())
                //.retryWhen(new HttpCompensateFunction(3))
                .subscribe(new MyDefaultObserver<MyResponse<ForgetPassEntity>>() {
                    @Override
                    public void onRequestResultSuccess(MyResponse<ForgetPassEntity> response) {
                        Logger.d("修改密码:" + response.toString());
                        callBacks.success(response);
                    }

                    @Override
                    public void onRequestError(Throwable throwable, String throwableMsg) {
                        Logger.d(throwableMsg);
                        callBacks.fail(throwableMsg);
                    }
                });

    }


    /**
     * 获取验证码
     * @param phoneNum
     * @param mCallBack
     */
    public static void getVerification(String phoneNum,UCallBack<MyResponse> mCallBack) {
        final UCallBack callBacks = mCallBack;
        Map<String, Object> params = new HashMap<>();
        NetServiceRepository.getInstance().getDefaultNetService()
                .getVerification(phoneNum)
                .compose(HttpUtils.<MyResponse<getSmsVerifyEntity>>requestSchedulerHelper())
                //.retryWhen(new HttpCompensateFunction(3))
                .subscribe(new MyDefaultObserver<MyResponse<getSmsVerifyEntity>>() {
                    @Override
                    public void onRequestResultSuccess(MyResponse<getSmsVerifyEntity> response) {
                        Logger.d("获取验证码:" + response.toString());
                        callBacks.success(response);
                    }

                    @Override
                    public void onRequestError(Throwable throwable, String throwableMsg) {
                        Logger.d(throwableMsg);
                        callBacks.fail(throwableMsg);
                    }
                });

    }



    public static void checkCode(String phoneNum,String code,UCallBack<MyResponse> mCallBack) {
        final UCallBack callBacks = mCallBack;
        Map<String, Object> params = new HashMap<>();
        NetServiceRepository.getInstance().getDefaultNetService()
                .checkCode(phoneNum,code)
                .compose(HttpUtils.<MyResponse<getSmsVerifyEntity>>requestSchedulerHelper())
                //.retryWhen(new HttpCompensateFunction(3))
                .subscribe(new MyDefaultObserver<MyResponse<getSmsVerifyEntity>>() {
                    @Override
                    public void onRequestResultSuccess(MyResponse<getSmsVerifyEntity> response) {
                        Logger.d("校验验证码:" + response.toString());
                        callBacks.success(response);
                    }

                    @Override
                    public void onRequestError(Throwable throwable, String throwableMsg) {
                        Logger.d(throwableMsg);
                        callBacks.fail(throwableMsg);
                    }
                });

    }


    @Override
    public void login(LoginReq loginEntity, UCallBack<MyResponse> mCallBack) {
        final UCallBack callBack; callBack = mCallBack;

        Map<String, Object> params = new HashMap<>();
        params.put("userName", loginEntity.getUserName());
        params.put("passWord", loginEntity.getPassWord());
        params.put("deviceType", loginEntity.getDeviceType());
        NetServiceRepository.getInstance().getDefaultNetService()
                .login(HttpUtils.getRequestBody(params))
                .compose(HttpUtils.<MyResponse<LoginEntity>>requestSchedulerHelper())
                //.retryWhen(new HttpCompensateFunction(3))
                .subscribe(new MyDefaultObserver<MyResponse<LoginEntity>>() {
                    @Override
                    public void onRequestResultSuccess(MyResponse<LoginEntity> response) {
                        Logger.d("登录成功:" + response.toString());
                        callBack.success(response);
                    }

                    @Override
                    public void onRequestError(Throwable throwable, String throwableMsg) {
                        Logger.d(throwableMsg);
                        callBack.fail(throwableMsg);
                    }
                });
    }
}
