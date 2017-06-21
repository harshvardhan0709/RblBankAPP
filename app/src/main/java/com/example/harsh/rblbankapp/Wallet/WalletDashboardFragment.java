package com.example.harsh.rblbankapp.Wallet;

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


import com.example.harsh.rblbankapp.R;
import com.example.harsh.rblbankapp.Wallet.walDashFragment;

public class WalletDashboardFragment extends Fragment {

    private static final String TAG = WalletDashboardFragment.class.getSimpleName();

    Fragment fragment;
    FragmentManager fragmentManager;

    LinearLayout dashboard,historyTans;
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

        return v1;

    }

    public void initfrag()
    {


    }

}
