package com.example.quake_report;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<Earthquake> earthquake = new ArrayList<>();


        earthquake.add(3,"San Francisco","03 Jan 2017");
        earthquake.add("London");
        earthquake.add("Tokyo");
        earthquake.add("Mexico City");
        earthquake.add("Moscow");
        earthquake.add("Reo de Janeiro");
        earthquake.add("Paris");

        ListView earthquakeListView = (ListView)findViewById(R.id.list);

        EarthquakeAdapter adapter = new EarthquakeAdapter(MainActivity.this,R.layout.earthquake_list,earthquake);


        earthquakeListView.setAdapter(adapter);

    }
}
