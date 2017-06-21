package com.example.harsh.rblbankapp.RegLogin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.harsh.rblbankapp.Constants;
import com.example.harsh.rblbankapp.DashboardActivity;
import com.example.harsh.rblbankapp.MainActivity;
import com.example.harsh.rblbankapp.R;

public class LoginActivity extends Activity {

    EditText ed1,ed2,ed3;
    Button b1;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Name = "nameKey";
    public static final String Phone = "phoneKey";
    public static final String Email = "emailKey";

    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ed1 = (EditText) findViewById(R.id.et_email);
        ed2 = (EditText) findViewById(R.id.et_password);
        b1 = (Button) findViewById(R.id.btn_login);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = ed1.getText().toString();
                String n = ed2.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(Name, n);
                editor.putString(Email, e);
                editor.putString(Constants.IS_LOGGED_IN,"yes");
                editor.commit();
                Toast.makeText(LoginActivity.this, "Thanks", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}
