package com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.momobites.prash.nepalivarnamaala.Adapters.MenuAdapter;
import com.momobites.prash.nepalivarnamaala.Adapters.MenuModel;
import com.momobites.prash.nepalivarnamaala.R;
import com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers.barhakhari.b30_12Sound_MainFragment;

import java.util.ArrayList;


public class a1_menu_activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        // Create a list of letters
        final ArrayList<MenuModel> menu = new ArrayList<>();
        menu.add(new MenuModel(
                R.string.category_letters,
                R.string.category_letters,
                b10_Main_Fragment.class,
                R.drawable.color_red));
        menu.add(new MenuModel(
                R.string.category_numbers,
                R.string.category_numbers,
                b20_Main_Fragment.class,
                R.drawable.color_blue));


        // Create LetterAdapter
        MenuAdapter adapter = new MenuAdapter(this, menu);
        // Create ListView
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the list use the adapter created above
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {

                // Get the  object at the given position the user clicked on
                MenuModel letter = menu.get(position);
                Intent myIntent = new Intent(view.getContext(), letter.getmMenuID());
                startActivity(myIntent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }




}
