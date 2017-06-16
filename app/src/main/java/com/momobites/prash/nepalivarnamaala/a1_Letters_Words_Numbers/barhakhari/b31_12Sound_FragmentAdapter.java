package com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers.barhakhari;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class b31_12Sound_FragmentAdapter extends FragmentStatePagerAdapter {

    public b31_12Sound_FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new c1();
        } else if (position == 1){
            return new c2();
        } else if (position == 2){
            return new c3();
        } else if (position == 3){
            return new c4();
        } else if (position == 4){
            return new c5();
        } else if (position == 5){
            return new c6();
        } else if (position == 6){
            return new c7();
        } else if (position == 7){
            return new c8();
        } else if (position == 8){
            return new c9();
        } else if (position == 9){
            return new c2();
        } else if (position == 10){
            return new c2();
        } else {
            return new c2();
        }
    }

    @Override
    public int getCount() {
        return 12;
    }
}
