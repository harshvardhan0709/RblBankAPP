package com.example.harsh.rblbankapp.OfflinePayment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.harsh.rblbankapp.R;
import com.example.harsh.rblbankapp.RegLogin.MainLogRegActivity;
import com.example.harsh.rblbankapp.SplashActivity;
import com.example.harsh.rblbankapp.Wallet.walDashFragment;

public class OfflinePaymentFragment extends Fragment {

    private static final String TAG = OfflinePaymentFragment.class.getSimpleName();
    LinearLayout ussd,nfc,bluetooth,sms;

    public OfflinePaymentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_offline_payment, container, false);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
        walDashFragment fragment = new walDashFragment();
        fragmentTransaction.add(R.id.offlineFrame, fragment);
        fragmentTransaction.commit();

        ussd = (LinearLayout)v.findViewById(R.id.ussdpay);
        ussd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                UssdFragment fragment = new UssdFragment();
                fragmentTransaction.replace(R.id.offlineFrame, fragment);
                fragmentTransaction.commit();
            }
        });
        sms = (LinearLayout)v.findViewById(R.id.smspay);
        sms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                UssdFragment fragment = new UssdFragment();
                fragmentTransaction.replace(R.id.offlineFrame, fragment);
                fragmentTransaction.commit();
            }
        });
        bluetooth = (LinearLayout)v.findViewById(R.id.bluetoothpay);
        bluetooth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                BluetoothPayFragment fragment = new BluetoothPayFragment();
                fragmentTransaction.replace(R.id.offlineFrame, fragment);
                fragmentTransaction.commit();
            }
        });
        nfc = (LinearLayout)v.findViewById(R.id.nfcpay);
        nfc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                NfcFragment fragment = new NfcFragment();
                fragmentTransaction.replace(R.id.offlineFrame, fragment);
                fragmentTransaction.commit();
            }
        });

        return v;

    }




}
