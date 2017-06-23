package com.example.harsh.rblbankapp.RegLogin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.example.harsh.rblbankapp.Constants;
import com.example.harsh.rblbankapp.DashboardActivity;
import com.example.harsh.rblbankapp.MainActivity;
import com.example.harsh.rblbankapp.R;
import com.example.harsh.rblbankapp.SplashActivity;

public class MainLogRegActivity extends AppCompatActivity implements ActionBar.TabListener {

    SharedPreferences sharedpreferences;
    private static final String TAG = MainLogRegActivity.class.getSimpleName();
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_log_reg);

        //sharedpreferences = getSharedPreferences(LoginActivity.MyPREFERENCES, Context.MODE_PRIVATE);

        tabLayout = (TabLayout)findViewById(R.id.offlinetabs);
        viewPager = (ViewPager)findViewById(R.id.offlineview_pager);
        viewPager.setAdapter(new TabPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.setSelectedTabIndicatorColor(Color.rgb(136,0,169));

        //Button signIn = (Button)findViewById(R.id.SignIn);
        //Button register = (Button)findViewById(R.id.Register);

        //abc();
        /*signIn.setOnClickListener(new View.OnClickListener() {
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
        });*/


    }



    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}

