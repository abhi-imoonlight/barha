package com.momobites.prash.nepalivarnamaala.a5_Activities_of_Daily_Living;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers.b22_numbersFragment;
import com.momobites.prash.nepalivarnamaala.R;

/**
 * Created by prash on 6/8/2017.
 */

public class b11_Phrases_FragmentAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public b11_Phrases_FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new b12_phrases_greetingsFragment();
        } else if (position == 1) {
            return new b15_phrases_placesFragment();
        } else {
            return new b13_phrases_foodFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_phrases_greetings);
        } else if (position == 1) {
            return mContext.getString(R.string.category_phrases_places);
        } else  {
            return mContext.getString(R.string.category_phrases_food);
        }
    }

}
