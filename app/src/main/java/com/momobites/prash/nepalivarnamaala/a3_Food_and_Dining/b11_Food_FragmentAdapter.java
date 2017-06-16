package com.momobites.prash.nepalivarnamaala.a3_Food_and_Dining;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;

/**
 * Created by prash on 6/8/2017.
 */

public class b11_Food_FragmentAdapter extends FragmentPagerAdapter {



    public b11_Food_FragmentAdapter(Context context, FragmentManager fm) {
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
        } else if (position == 3) {
            return new b15_drinksFragment();
        } else  {
            return new b13_fruits_n_nutsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_food);
        } else if (position == 1) {
            return mContext.getString(R.string.category_food_vegetables);
        } else if (position == 2) {
            return mContext.getString(R.string.category_food_drinks);
        } else  {
            return mContext.getString(R.string.category_food_fruits);
        }
    }

}
