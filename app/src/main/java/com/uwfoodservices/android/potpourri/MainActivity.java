package com.uwfoodservices.android.potpourri;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 5; i++) {
            Bundle args = new Bundle();
            args.putInt("index", i+1);
            CuisineScroller scroller = new CuisineScroller();
            scroller.setArguments(args);
            getSupportFragmentManager().beginTransaction().add(R.id.main_scroll_container, scroller).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.recommendme:
                Intent i = new Intent(MainActivity.this, RecommendActivity.class);
                startActivity(i);
                return true;

            case R.id.search:
                Intent j = new Intent(MainActivity.this, SearchResults.class);
                startActivity(j);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}