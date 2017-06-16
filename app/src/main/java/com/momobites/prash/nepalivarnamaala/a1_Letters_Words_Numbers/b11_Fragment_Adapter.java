package com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class b11_Fragment_Adapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public b11_Fragment_Adapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new b13_consonant_Fragment();
        }
        else  {
            return new b14_vowelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 1) {
            return mContext.getString(R.string.category_consonants);
        }
        else  {
            return mContext.getString(R.string.category_vowels);
        }
    }

}
