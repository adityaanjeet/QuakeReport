package com.example.quake_report;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<Earthquake> earthquake = QueryUtils.extractEarthquakes();

        ListView earthquakeListView = findViewById(R.id.list);

        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquake);


        earthquakeListView.setAdapter(adapter);

    }
}
