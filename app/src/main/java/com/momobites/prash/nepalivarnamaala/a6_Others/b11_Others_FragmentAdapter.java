package com.momobites.prash.nepalivarnamaala.a6_Others;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;
import com.momobites.prash.nepalivarnamaala.a4_Animals_Birds_Reptiles.b12_animalsFragment;

/**
 * Created by prash on 6/8/2017.
 */

public class b11_Others_FragmentAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public b11_Others_FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new b12_colorsFragment();
        } else if (position == 1) {
            return new b13_flowersFragment();
        }  else {
            return new b14_clothesFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_colors);
        } else if (position == 1) {
            return mContext.getString(R.string.category_flowers);
        } else  {
            return mContext.getString(R.string.category_clothes
            );
        }
    }

}