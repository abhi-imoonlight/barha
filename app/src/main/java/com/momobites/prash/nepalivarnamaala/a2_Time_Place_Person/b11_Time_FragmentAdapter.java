package com.momobites.prash.nepalivarnamaala.a2_Time_Place_Person;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;

/**
 * Created by prash on 6/8/2017.
 */

public class b11_Time_FragmentAdapter extends FragmentPagerAdapter {



    public b11_Time_FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /** Context of the app */
    private Context mContext;

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new b13_dayFragment();
        } else if (position == 1) {
            return new b16_weekFragment();
        } else if (position == 2){
            return new b14_monthFragment();
        } else {
            return new b15_seasonFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_day);
        } else if (position == 1) {
            return mContext.getString(R.string.category_week);
        } else if (position == 2) {
            return mContext.getString(R.string.category_month);
        } else  {
            return mContext.getString(R.string.category_season);
        }
    }

}