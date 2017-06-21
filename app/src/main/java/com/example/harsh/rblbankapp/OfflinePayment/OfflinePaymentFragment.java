package com.example.harsh.rblbankapp.OfflinePayment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.harsh.rblbankapp.R;

public class OfflinePaymentFragment extends Fragment {

    private static final String TAG = OfflinePaymentFragment.class.getSimpleName();
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public OfflinePaymentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_offline_payment, container, false);

        tabLayout = (TabLayout)v.findViewById(R.id.offlinetabs);
        viewPager = (ViewPager)v.findViewById(R.id.offlineview_pager);
        viewPager.setAdapter(new CustomFragmentPageAdapterOffline(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        return v;

    }

}
