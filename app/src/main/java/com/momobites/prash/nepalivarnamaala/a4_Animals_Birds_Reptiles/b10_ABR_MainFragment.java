package com.momobites.prash.nepalivarnamaala.a4_Animals_Birds_Reptiles;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.momobites.prash.nepalivarnamaala.R;
import com.momobites.prash.nepalivarnamaala.a3_Food_and_Dining.b11_Food_FragmentAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class b10_ABR_MainFragment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_fragments);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        b11_ABR_FragmentAdapter adapter = new b11_ABR_FragmentAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        tabLayout.setupWithViewPager(viewPager);
    }

}