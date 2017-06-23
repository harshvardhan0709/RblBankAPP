package com.example.harsh.rblbankapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.harsh.rblbankapp.RegLogin.LoginFragment;
import com.example.harsh.rblbankapp.RegLogin.MainLogRegActivity;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sharedpreferences = getSharedPreferences(LoginFragment.MyPREFERENCES, Context.MODE_PRIVATE);


        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(progressBar.VISIBLE);

        //Wait for 3 seconds and start Activity Main
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abc();
            }
        },1000);
    }

    public void abc()
    {
        String s;
        s=(sharedpreferences.getString(Constants.IS_LOGGED_IN,""));
        if (s.equals("yes")) {
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
            finish();
        }
        else
        {
            SplashActivity.this.startActivity(new Intent(SplashActivity.this,MainLogRegActivity.class));
            SplashActivity.this.finish();
        }

    }

}
