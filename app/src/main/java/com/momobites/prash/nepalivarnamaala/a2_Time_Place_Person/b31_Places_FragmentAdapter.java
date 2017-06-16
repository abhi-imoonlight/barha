package com.momobites.prash.nepalivarnamaala.a2_Time_Place_Person;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;

/**
 * Created by prash on 6/8/2017.
 */

public class b31_Places_FragmentAdapter extends FragmentPagerAdapter {



    public b31_Places_FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /** Context of the app */
    private Context mContext;

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new b34_places_generalFragment();
        } else if (position == 1) {
            return new b32_citiesFragment();
        } else  {
            return new b33_countriesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_places_general);
        } else if (position == 1) {
            return mContext.getString(R.string.category_places_cities);
        } else  {
            return mContext.getString(R.string.category_places_countries);
        }
    }

}