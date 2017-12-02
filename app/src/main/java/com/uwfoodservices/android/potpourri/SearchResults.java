package com.uwfoodservices.android.potpourri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SearchResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        for (int i = 0; i < 20; i++) {
            Bundle args = new Bundle();
            args.putInt("index", i+1);
            RestaurantResult result = new RestaurantResult();
            result.setArguments(args);
            getSupportFragmentManager().beginTransaction().add(R.id.results_container, result).commit();
        }
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}
