package com.momobites.prash.nepalivarnamaala.a4_Animals_Birds_Reptiles;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;
import com.momobites.prash.nepalivarnamaala.a3_Food_and_Dining.b12_food_dailyFragment;
import com.momobites.prash.nepalivarnamaala.a3_Food_and_Dining.b13_fruits_n_nutsFragment;
import com.momobites.prash.nepalivarnamaala.a3_Food_and_Dining.b14_vegetablesFragment;

/**
 * Created by prash on 6/14/2017.
 */

public class b11_ABR_FragmentAdapter extends FragmentPagerAdapter {



    public b11_ABR_FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /** Context of the app */
    private Context mContext;

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new b12_animalsFragment();
        } else if (position == 1) {
            return new b13_birdsFragment();
        } else if (position == 2) {
            return new b14_reptilesFragment();
        } else  {
            return new b15_fistFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_animals);
        } else if (position == 1) {
            return mContext.getString(R.string.category_birds);
        } else if (position == 2) {
                return mContext.getString(R.string.category_reptiles);
        } else  {
            return mContext.getString(R.string.category_fish);
        }
    }

}