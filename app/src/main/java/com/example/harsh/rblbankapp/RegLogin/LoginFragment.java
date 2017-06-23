package com.example.harsh.rblbankapp.RegLogin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harsh.rblbankapp.Constants;
import com.example.harsh.rblbankapp.DashboardActivity;
import com.example.harsh.rblbankapp.R;


public class LoginFragment extends Fragment {

    EditText ed1,ed2,ed3;
    Button b1;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Name = "nameKey";
    public static final String Phone = "phoneKey";
    public static final String Email = "emailKey";

    SharedPreferences sharedpreferences;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View loginv = inflater.inflate(R.layout.fragment_login, container, false);


        ed1 = (EditText)loginv.findViewById(R.id.et_email);
        ed2 = (EditText)loginv.findViewById(R.id.et_password);
        b1 = (Button)loginv.findViewById(R.id.btn_login);
        sharedpreferences = getActivity().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

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
                Toast.makeText(getContext(), "Thanks", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getContext(), DashboardActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return loginv;
    }

}
