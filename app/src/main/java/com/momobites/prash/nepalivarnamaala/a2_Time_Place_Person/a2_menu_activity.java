package com.momobites.prash.nepalivarnamaala.a2_Time_Place_Person;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.momobites.prash.nepalivarnamaala.Adapters.MenuAdapter;
import com.momobites.prash.nepalivarnamaala.Adapters.MenuModel;
import com.momobites.prash.nepalivarnamaala.R;

import java.util.ArrayList;

public class a2_menu_activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        // Create a list of letters
        final ArrayList<MenuModel> menu = new ArrayList<>();
        menu.add(new MenuModel(
                R.string.category_time,
                R.string.category_time,
                b10_Time_MainFragment.class,
                R.drawable.color_red));
        menu.add(new MenuModel(
                R.string.category_places,
                R.string.category_places,
                b30_Places_MainFragment.class,
                R.drawable.color_purple));
        menu.add(new MenuModel(
                R.string.category_relations,
                R.string.category_relations,
                b20_Relation_MainFragment.class,
                R.drawable.color_purple));


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
