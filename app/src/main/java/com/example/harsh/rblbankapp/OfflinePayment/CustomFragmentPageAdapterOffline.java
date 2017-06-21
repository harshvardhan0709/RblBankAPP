package com.example.harsh.rblbankapp.OfflinePayment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.harsh.rblbankapp.BankInfo.BankInformationFrag;

/**
 * Created by harsh on 17/6/17.
 */

public class CustomFragmentPageAdapterOffline extends FragmentPagerAdapter {

    private static final String TAG = CustomFragmentPageAdapterOffline.class.getSimpleName();
    private static final int FRAGMENT_COUNT = 4;

    public CustomFragmentPageAdapterOffline(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BluetoothPayFragment();
            case 1:
                return new NfcFragment();
            case 2:
                return new BankInformationFrag();
            case 3:
                return new UssdFragment();
        }
        return null;
    }
    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Btooth Payment";
            case 1:
                return "Nfc Payment";
            case 2:
                return "SMS Payment";
            case 3:
                return "USSD Payment";
        }
        return null;
    }
}