package com.example.bicyclefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AllBikesDetailActivity extends AppCompatActivity {
    public static final String EXTRA_BIKE_ID = "id";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_bike_details, container, false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_bikes_details);
        AllBikesDetailActivity frag = (AllBikeDetailsFragment);
        getSupportFragmentManager().findFragmentById(R.id.bike_detail_frag):
        frag.setAllBikeDetails(1);
    }
}