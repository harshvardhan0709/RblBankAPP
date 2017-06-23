package com.example.harsh.rblbankapp.Wallet;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


import com.example.harsh.rblbankapp.OfflinePayment.BluetoothPayFragment;
import com.example.harsh.rblbankapp.OfflinePayment.NfcFragment;
import com.example.harsh.rblbankapp.OfflinePayment.UssdFragment;
import com.example.harsh.rblbankapp.R;
import com.example.harsh.rblbankapp.Wallet.walDashFragment;

public class WalletDashboardFragment extends Fragment {

    private static final String TAG = WalletDashboardFragment.class.getSimpleName();

    Fragment fragment;
    FragmentManager fragmentManager;

    LinearLayout dashboard,home,historyTans,walt1,walt2;
    FrameLayout walletFrame;


    public WalletDashboardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1 = inflater.inflate(R.layout.fragment_wallet_dashboard, container, false);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        walDashFragment fragment = new walDashFragment();
        fragmentTransaction.add(R.id.waltFrame, fragment);
        fragmentTransaction.commit();

        dashboard = (LinearLayout)v1.findViewById(R.id.wallet_dash);
        home = (LinearLayout)v1.findViewById(R.id.walletHome);
        historyTans = (LinearLayout)v1.findViewById(R.id.walletTransHist);
        walt1 = (LinearLayout)v1.findViewById(R.id.walt);
        walt2 = (LinearLayout)v1.findViewById(R.id.walt1);


        dashboard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                walDashFragment fragment = new walDashFragment();
                fragmentTransaction.replace(R.id.waltFrame, fragment);
                fragmentTransaction.commit();
                bground(5);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                UssdFragment fragment = new UssdFragment();
                fragmentTransaction.replace(R.id.waltFrame, fragment);
                fragmentTransaction.commit();
                bground(1);
            }
        });
        historyTans.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                WalletTransHistoryFragment fragment = new WalletTransHistoryFragment();
                fragmentTransaction.replace(R.id.waltFrame, fragment);
                fragmentTransaction.commit();
                bground(2);
            }
        });
        walt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //FragmentManager fragmentManager = getFragmentManager();
                //FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                //WalletTransHistoryFragment fragment = new WalletTransHistoryFragment();
                //fragmentTransaction.replace(R.id.waltFrame, fragment);
                //fragmentTransaction.commit();
                bground(3);
            }
        });
        walt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //FragmentManager fragmentManager = getFragmentManager();
                //FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                //WalletTransHistoryFragment fragment = new WalletTransHistoryFragment();
                //fragmentTransaction.replace(R.id.waltFrame, fragment);
                //fragmentTransaction.commit();
                bground(4);
            }
        });

        return v1;

    }

    public void bground(int a)
    {
        if(a == 4)
        {
            walt2.setBackground( getResources().getDrawable(R.drawable.theme));
            home.setBackgroundColor(Color.WHITE);
            walt1.setBackgroundColor(Color.WHITE);
            historyTans.setBackgroundColor(Color.WHITE);
        }
        if(a == 3)
        {
            walt1.setBackground( getResources().getDrawable(R.drawable.theme));
            home.setBackgroundColor(Color.WHITE);
            walt2.setBackgroundColor(Color.WHITE);
            historyTans.setBackgroundColor(Color.WHITE);
        }
        if(a == 1)
        {
            home.setBackground( getResources().getDrawable(R.drawable.theme));
            historyTans.setBackgroundColor(Color.WHITE);
            walt2.setBackgroundColor(Color.WHITE);
            walt1.setBackgroundColor(Color.WHITE);
        }
        if(a == 2)
        {
            historyTans.setBackground( getResources().getDrawable(R.drawable.theme));
            walt2.setBackgroundColor(Color.WHITE);
            walt1.setBackgroundColor(Color.WHITE);
            home.setBackgroundColor(Color.WHITE);

        }
        if(a == 5)
        {
            historyTans.setBackgroundColor(Color.WHITE);
            walt2.setBackgroundColor(Color.WHITE);
            walt1.setBackgroundColor(Color.WHITE);
            home.setBackgroundColor(Color.WHITE);

        }
    }

}
