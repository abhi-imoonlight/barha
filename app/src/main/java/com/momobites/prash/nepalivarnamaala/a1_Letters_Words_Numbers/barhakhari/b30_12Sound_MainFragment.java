package com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers.barhakhari;

import android.os.Bundle;
import android.support.v4.view.ViewGroupCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.momobites.prash.nepalivarnamaala.R;

public class b30_12Sound_MainFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int position = 0;
        Bundle extra = getIntent().getExtras();
        if (extra !=null) {
            position = extra.getInt("x");
        }

        // Toast Message
        int consonant_number = position + 1;
        Toast.makeText( this  , "Position Number = " + consonant_number, Toast.LENGTH_SHORT).show();


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_fragments_12sounds);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        b31_12Sound_FragmentAdapter fragment = new b31_12Sound_FragmentAdapter(getSupportFragmentManager());

        //viewPager.setCurrentItem(position);

        // fragment.instantiateItem( viewPager , position);



        // Set the adapter onto the view pager
        viewPager.setAdapter(fragment);
    }
}
