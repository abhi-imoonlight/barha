package com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;
import com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers.barhakhari.c1;

/**
 * Created by prash on 6/14/2017.
 */

public class b21_Fragment_Adapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public b21_Fragment_Adapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new b22_numbersFragment();
        } else if (position == 1) {
            return new b14_vowelsFragment();
        } else {
            return new c1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_vowels);
        }else  {
            return mContext.getString(R.string.category_barhakhari);
        }
    }

}