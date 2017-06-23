package com.example.harsh.rblbankapp.BudgetTracker;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TabHost;

import com.example.harsh.rblbankapp.OfflinePayment.BluetoothPayFragment;
import com.example.harsh.rblbankapp.OfflinePayment.NfcFragment;
import com.example.harsh.rblbankapp.OfflinePayment.UssdFragment;
import com.example.harsh.rblbankapp.R;
import com.example.harsh.rblbankapp.Wallet.WalletTransHistoryFragment;
import com.example.harsh.rblbankapp.Wallet.walDashFragment;

import im.dacer.androidcharts.LineView;


public class BudgetDashboardFragment extends Fragment {

    LinearLayout dashboard,home,historyTans,walt1,walt2;

    public BudgetDashboardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v2 = inflater.inflate(R.layout.fragment_budget_dashboard, container, false);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        budget_sec_Fragment fragment = new budget_sec_Fragment();
        fragmentTransaction.add(R.id.budgetFrame, fragment);
        fragmentTransaction.commit();

        dashboard = (LinearLayout)v2.findViewById(R.id.budget_dash);
        home = (LinearLayout)v2.findViewById(R.id.budgetHome);
        historyTans = (LinearLayout)v2.findViewById(R.id.budgetTransHist);
        walt1 = (LinearLayout)v2.findViewById(R.id.budgetas);
        walt2 = (LinearLayout)v2.findViewById(R.id.budgetwer);


        dashboard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                budget_sec_Fragment fragment = new budget_sec_Fragment();
                fragmentTransaction.replace(R.id.budgetFrame, fragment);
                fragmentTransaction.commit();
                bground1(5);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                Budget_transHistory_Fragment fragment = new Budget_transHistory_Fragment();
                fragmentTransaction.replace(R.id.budgetFrame, fragment);
                fragmentTransaction.commit();
                bground1(1);
            }
        });
        historyTans.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                budgettranListFragment fragment = new budgettranListFragment();
                fragmentTransaction.replace(R.id.budgetFrame, fragment);
                fragmentTransaction.commit();
                bground1(2);
            }
        });
        walt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                BudgetRecentFragment fragment = new BudgetRecentFragment();
                fragmentTransaction.replace(R.id.budgetFrame, fragment);
                fragmentTransaction.commit();
                bground1(3);
            }
        });
        walt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //FragmentManager fragmentManager = getFragmentManager();
                //FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
                //WalletTransHistoryFragment fragment = new WalletTransHistoryFragment();
                //fragmentTransaction.replace(R.id.waltFrame, fragment);
                //fragmentTransaction.commit();
                bground1(4);
            }
        });


        return v2;
    }

    public void bground1(int b)
    {
        if(b == 4)
        {
            walt2.setBackground( getResources().getDrawable(R.drawable.theme));
            home.setBackgroundColor(Color.WHITE);
            walt1.setBackgroundColor(Color.WHITE);
            historyTans.setBackgroundColor(Color.WHITE);
        }
        if(b == 3)
        {
            walt1.setBackground( getResources().getDrawable(R.drawable.theme));
            home.setBackgroundColor(Color.WHITE);
            walt2.setBackgroundColor(Color.WHITE);
            historyTans.setBackgroundColor(Color.WHITE);
        }
        if(b == 1)
        {
            home.setBackground( getResources().getDrawable(R.drawable.theme));
            historyTans.setBackgroundColor(Color.WHITE);
            walt2.setBackgroundColor(Color.WHITE);
            walt1.setBackgroundColor(Color.WHITE);
        }
        if(b == 2)
        {
            historyTans.setBackground( getResources().getDrawable(R.drawable.theme));
            walt2.setBackgroundColor(Color.WHITE);
            walt1.setBackgroundColor(Color.WHITE);
            home.setBackgroundColor(Color.WHITE);

        }
        if(b == 5)
        {
            historyTans.setBackgroundColor(Color.WHITE);
            walt2.setBackgroundColor(Color.WHITE);
            walt1.setBackgroundColor(Color.WHITE);
            home.setBackgroundColor(Color.WHITE);

        }
    }
}
