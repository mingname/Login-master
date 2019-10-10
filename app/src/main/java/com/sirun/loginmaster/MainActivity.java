package com.sirun.loginmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sirun.httputil.MyResponse;
import com.sirun.loginmodules.Intefice.ICenterTier;
import com.sirun.loginmodules.Intefice.UCallBack;
import com.sirun.loginmodules.config.LoginCorrelation;
import com.sirun.loginmodules.config.Urls;
import com.sirun.loginmodules.entity.LoginEntity;
import com.sirun.loginmodules.entity.request.LoginReq;

public class MainActivity extends AppCompatActivity {

    private TextView txt_test;

    LoginCorrelation loginCorrelation ;

    private Button mBtn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginCorrelation = new LoginCorrelation();



        LoginCorrelation.setBaseUrl(Urls.WEB_ULR);
        initView();
        initClick();

        //登录
        LoginCorrelation.login("18494330044", "654321", "1", new UCallBack<MyResponse>() {
            @Override
            public void success(MyResponse<MyResponse> msg) {
//                txt_test.setText(msg.getSrresult()+"");
            }

            @Override
            public void fail(String msg) {

            }
        });

        //忘记密码
//        LoginCorrelation.forgetPass("123456","15801676429", new UCallBack<MyResponse>() {
//            @Override
//            public void success(MyResponse<MyResponse> msg) {
//                txt_test.setText(msg.getSrresult()+"23");
//            }
//
//            @Override
//            public void fail(String msg) {
//                txt_test.setText(msg);
//            }
//        });

        //获取验证码
//        LoginCorrelation.getVerification("13126930322", new UCallBack<MyResponse>() {
//            @Override
//            public void success(MyResponse<MyResponse> msg) {
//                txt_test.setText(msg.getResult()+""+msg.getSrresult());
//            }
//
//            @Override
//            public void fail(String msg) {
//                txt_test.setText(msg);
//            }
//        });


        //校验验证码
        LoginCorrelation.checkCode("13126930322", "123456", new UCallBack<MyResponse>() {
            @Override
            public void success(MyResponse<MyResponse> msg) {
                txt_test.setText(msg.getResult()+""+msg.getSrresult());
            }

            @Override
            public void fail(String msg) {
                txt_test.setText(msg);
            }
        });




    }

    private void initView(){
        txt_test = (TextView) this.findViewById(R.id.txt_test);
        mBtn_login = (Button) this.findViewById(R.id.btn_login);
    }

    private void initClick(){
        mBtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LoginReq loginReq = new LoginReq();
                loginReq.setUserName("15801676429");
                loginReq.setPassWord("123456");
                loginReq.setDeviceType("1");
                loginCorrelation.login(loginReq, new UCallBack<MyResponse>() {
                    @Override
                    public void success(MyResponse<MyResponse> msg) {
                        txt_test.setText(msg.getSrresult()+"");
                    }

                    @Override
                    public void fail(String msg) {
                        txt_test.setText(msg+"");
                    }
                });

            }
        });
    }
}
