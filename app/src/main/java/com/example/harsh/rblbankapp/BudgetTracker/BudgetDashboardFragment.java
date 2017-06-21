package com.example.harsh.rblbankapp.BudgetTracker;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TabHost;

import com.example.harsh.rblbankapp.R;

import im.dacer.androidcharts.LineView;


public class BudgetDashboardFragment extends Fragment {

    public BudgetDashboardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v2 = inflater.inflate(R.layout.fragment_budget_dashboard, container, false);

        return v2;
    }


}
