package com.sirun.loginmodules.http;



import com.sirun.httputil.MyResponse;
import com.sirun.loginmodules.entity.ForgetPassEntity;
import com.sirun.loginmodules.entity.LoginEntity;
import com.sirun.loginmodules.entity.TestEntity;
import com.sirun.loginmodules.entity.getSmsVerifyEntity;


import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;



public interface NetService {

    @POST("user/login")
    Observable<MyResponse<LoginEntity>> login(@Body RequestBody body);

    @POST("user/forgetPassword/{phoneNum}")
    Observable<MyResponse<ForgetPassEntity>> forget(@Body RequestBody body, @Path("phoneNum")String phonenum);

    @POST("user/sms/verification/{phoneNum}")
    Observable<MyResponse<getSmsVerifyEntity>> getVerification(@Path("phoneNum")String phonenum);

    @POST("user/sms/verifyVerification/{phoneNum}/{code}")
    Observable<MyResponse<getSmsVerifyEntity>> checkCode(@Path("phoneNum")String phonenum,@Path("code")String code);



}
