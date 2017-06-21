package com.example.harsh.rblbankapp.RegLogin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.harsh.rblbankapp.Constants;
import com.example.harsh.rblbankapp.DashboardActivity;
import com.example.harsh.rblbankapp.MainActivity;
import com.example.harsh.rblbankapp.R;
import com.example.harsh.rblbankapp.SplashActivity;

public class MainLogRegActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_log_reg);

        sharedpreferences = getSharedPreferences(LoginActivity.MyPREFERENCES, Context.MODE_PRIVATE);


        Button signIn = (Button)findViewById(R.id.SignIn);
        Button register = (Button)findViewById(R.id.Register);

        abc();
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainLogRegActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainLogRegActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


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

        }

    }
}

