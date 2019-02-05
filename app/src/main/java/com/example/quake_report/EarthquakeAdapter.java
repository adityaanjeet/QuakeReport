package com.example.quake_report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {

        super(context, 0, earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list, parent, false);
        }

        Earthquake current_earthquake = getItem(position);

        TextView magnitude = listItemView.findViewById(R.id.earthquake_magnitude);
        assert current_earthquake != null;
        magnitude.setText(current_earthquake.getmMagnitude());


        TextView location = listItemView.findViewById(R.id.earthquake_location);
        location.setText(current_earthquake.getmLocation());


        TextView date = listItemView.findViewById(R.id.earthquake_date);
        date.setText(current_earthquake.getmDate());

        return listItemView;
    }


}
