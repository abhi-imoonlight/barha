package com.momobites.prash.nepalivarnamaala.a2_Time_Place_Person;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.momobites.prash.nepalivarnamaala.R;

/**
 * Created by prash on 6/8/2017.
 */

public class b21_Relation_FragmentAdapter extends FragmentPagerAdapter {



    public b21_Relation_FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /** Context of the app */
    private Context mContext;

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new b22_closefamilyFragments();
        } else if (position == 1) {
            return new b23_extendedfamilyFragments();
        } else  {
            return new b24_relation_generalFragments();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_family_close);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family_extended);
        } else  {
            return mContext.getString(R.string.category_family_general);
        }
    }

}