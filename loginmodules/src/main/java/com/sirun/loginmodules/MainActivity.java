package com.sirun.loginmodules;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.sirun.httputil.HttpUtils;
import com.sirun.httputil.MyDefaultObserver;
import com.sirun.httputil.MyResponse;
import com.sirun.loginmodules.entity.LoginEntity;
import com.sirun.loginmodules.http.NetServiceRepository;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {


    private Button btnA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnA = (Button) this.findViewById(R.id.btnA);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a();
            }
        });
    }

    private void a() {
        Map<String, Object> params = new HashMap<>();
        params.put("userName", "test");
        params.put("passWord", "123456");
        params.put("deviceType", 1);
        NetServiceRepository.getInstance().getDefaultNetService()
                .login(HttpUtils.getRequestBody(params))
                .compose(HttpUtils.<MyResponse<LoginEntity>>requestSchedulerHelper())
                //.retryWhen(new HttpCompensateFunction(3))
                .subscribe(new MyDefaultObserver<MyResponse<LoginEntity>>() {
                    @Override
                    public void onRequestResultSuccess(MyResponse<LoginEntity> response) {
                        Logger.d("登录成功:" + response.toString());
                        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onRequestError(Throwable throwable, String throwableMsg) {
                        Logger.d(throwableMsg);
                        Toast.makeText(MainActivity.this, throwableMsg, Toast.LENGTH_SHORT).show();
                    }
                });
    }


}
