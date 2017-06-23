package com.example.harsh.rblbankapp.RegLogin;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.harsh.rblbankapp.OfflinePayment.NfcFragment;

/**
 * Created by harsh on 22/6/17.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int arg0) {
        switch (arg0) {
            case 0:
                return new LoginFragment();
            case 1:
                return new NfcFragment();
            case 2:
                return new NfcFragment();
            default:
                break;
        }
        return null;
    }
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Log In";
            case 1:
                return "Sign Up";
            case 2:
                return "UPI";
        }
        return null;
    }
}