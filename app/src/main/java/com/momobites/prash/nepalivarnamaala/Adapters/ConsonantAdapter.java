package com.momobites.prash.nepalivarnamaala.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.momobites.prash.nepalivarnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 6/14/2017.
 */

public class ConsonantAdapter extends ArrayAdapter<ConsonantModel> {


    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;


    /**
     * Create a new {@link LetterAdapter} object.
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param letters is the list of {@link LetterModel}s to be displayed.
     * @param colorResourceId is the resource ID for the background color
     */
    public ConsonantAdapter (Context context, ArrayList<ConsonantModel> letters, int colorResourceId) {
        super(context, 0, letters);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_letters_with_btn, parent, false);
        }

        // Get the {@link LetterModel} object located at this position in the list
        final ConsonantModel currentWord = getItem(position);
        // Find the TextView in the list_item.xml layout with the corresponding TextView
        TextView nepaliTextView = (TextView) listItemView.findViewById(R.id.nepali_text_view);
        TextView devnagariTextView = (TextView) listItemView.findViewById(R.id.devnagari_text_view);
        Button barhakhariButton = (Button) listItemView.findViewById(R.id.barhakhari);

        // Get the object and set Text/Image on it
        nepaliTextView.setText(currentWord.getNepaliTranslationId());
        devnagariTextView.setText(currentWord.getDevnagariId());

        //setting OnClickListener to each button
        barhakhariButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 // Toast.makeText(getContext(), currentWord.getDevnagariId(), Toast.LENGTH_SHORT).show();
                 Intent myIntent = new Intent(getContext(), currentWord.getmClassResourceId());
                    myIntent.putExtra("x", currentWord.getmBarhakhari());
                getContext().startActivity(myIntent);
            }
        });


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item
        return listItemView;
    }

}
