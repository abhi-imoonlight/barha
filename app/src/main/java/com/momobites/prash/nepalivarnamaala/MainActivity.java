package com.momobites.prash.nepalivarnamaala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.momobites.prash.nepalivarnamaala.a1_Letters_Words_Numbers.a1_menu_activity;
import com.momobites.prash.nepalivarnamaala.a2_Time_Place_Person.a2_menu_activity;
import com.momobites.prash.nepalivarnamaala.a3_Food_and_Dining.a3_menu_activity;
import com.momobites.prash.nepalivarnamaala.a4_Animals_Birds_Reptiles.a4_menu_activity;
import com.momobites.prash.nepalivarnamaala.a4_Animals_Birds_Reptiles.b10_ABR_MainFragment;
import com.momobites.prash.nepalivarnamaala.a5_Activities_of_Daily_Living.b10_Phrases_MainFragment;
import com.momobites.prash.nepalivarnamaala.a6_Others.b10_Others_MainFragment;
import com.momobites.prash.nepalivarnamaala.a2_Time_Place_Person.b30_Places_MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the particular category
        TextView letters = (TextView) findViewById(R.id.letters_word_numbers);
        TextView time = (TextView) findViewById(R.id.time_place_person);
        TextView food = (TextView) findViewById(R.id.food_and_dining);
        TextView animals = (TextView) findViewById(R.id.animals_bird_reptiles);
        TextView adl = (TextView) findViewById(R.id.adl);
        TextView others = (TextView) findViewById(R.id.others);

        // Set a click listener on Letter Textview
        letters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, a1_menu_activity.class);
                startActivity(Intent);
            }
        });

        // Set a click listener on b10_Time_MainFragment Textview
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, a2_menu_activity.class);
                startActivity(Intent);
            }
        });

        // Set a click listener on relatives Textview
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, a3_menu_activity.class);
                startActivity(Intent);
            }
        });

        // Set a click listener on food Textview
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, b10_ABR_MainFragment.class );
                startActivity(Intent);
            }
        });

        // Set a click listener on places Textview
        adl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, b10_Phrases_MainFragment.class);
                startActivity(Intent);
            }
        });


        // Set a click listener on others Textview
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this, b10_Others_MainFragment.class);
                startActivity(Intent);
            }
        });


    }
}
