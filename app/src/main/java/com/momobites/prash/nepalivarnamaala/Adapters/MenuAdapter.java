package com.momobites.prash.nepalivarnamaala.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.momobites.prash.nepalivarnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 6/13/2017.
 */

public class MenuAdapter extends ArrayAdapter<MenuModel> {

    /**
     * Create a new {@link MenuAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param menu is the list of {@link MenuModel}s to be displayed.
     */
    public MenuAdapter (Context context, ArrayList<MenuModel> menu) {
        super(context, 0, menu);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the {@link MenuModel} object located at this position in the list
        MenuModel currentMenu = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;



        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items_menu, parent, false);
        }



        // Find the TextView in the list_item.xml layout with the corresponding TextView
        TextView devnagariTextView = (TextView) listItemView.findViewById(R.id.devnagari_text_view);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);


        // Get the object and set Text/Image on it
        devnagariTextView.setText(currentMenu.getDevnagariId());
        defaultTextView.setText(currentMenu.getDefaultTranslationId());

        // For Image
        // Check if an image is provided for this menu or not
        if (currentMenu.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentMenu.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item
        return listItemView;
    }

}