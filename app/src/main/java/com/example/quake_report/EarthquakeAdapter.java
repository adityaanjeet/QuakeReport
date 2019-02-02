package com.example.quake_report;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter {


    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes){

        super(context,0,earthquakes);
    }




    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list,parent,false);
        }

        Earthquake current_earthquake = (Earthquake) getItem(position);

        TextView magnitude = listItemView.findViewById(R.id.earthquake_magnitude);
        magnitude.setText(current_earthquake.getmMagnitude());


        TextView location = listItemView.findViewById(R.id.earthquake_location);
        location.setText(current_earthquake.getmMagnitude());


        TextView date = listItemView.findViewById(R.id.earthquake_date);
        date.setText(current_earthquake.getmDate());

        return listItemView;
    }



}
