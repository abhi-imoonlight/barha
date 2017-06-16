package com.momobites.prash.nepalivarnamaala.a3_Food_and_Dining;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;

/**
 * Created by prash on 6/14/2017.
 */

public class b21_Dining_FragmentAdapter extends FragmentPagerAdapter {



    public b21_Dining_FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /** Context of the app */
    private Context mContext;

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new b12_food_dailyFragment();
        } else if (position == 1) {
            return new b14_vegetablesFragment();
        } else  {
            return new b13_fruits_n_nutsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_food);
        } else if (position == 1) {
            return mContext.getString(R.string.category_food_vegetables);
        } else  {
            return mContext.getString(R.string.category_food_fruits);
        }
    }

}