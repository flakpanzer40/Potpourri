package com.uwfoodservices.android.potpourri;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private String[] cuisines = {"American", "British", "Carribean", "Chinese", "French", "Indian",
            "Italian", "Japanese", "Mediterranean", "Mexican", "Spanish", "Thai", "Vietnamese"};
    private String[][] dishes = {{}, {}, {},
            {"Ma Po Tofu", "Kung Pao Chicken", "Sweet and Sour Pork"}, {},
            {"Butter Chicken", "Biryani", "Naan"}, {},
            {"Ramen", "Sushi", "Donburi"},
            {"Falafel", "Shawarma", "Fattoush"}, {}, {}, {}, {}};
    private int[][] dishpics = {{}, {}, {},
            {R.mipmap.mapotofu, R.mipmap.kungpaochicken, R.mipmap.sweetandsourpork},
            {}, {}, {},
            {R.mipmap.ramen, R.mipmap.sushi, R.mipmap.donburi},
            {R.mipmap.falafel, R.mipmap.shawarma, R.mipmap.fattoush}, {}, {}, {}, {}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Chinese
        Bundle args1 = new Bundle();
        args1.putString("cuisine", "Chinese");
        for (int i = 0; i < 3; i++) {
            args1.putInt(String.valueOf(i), dishpics[3][i]);
        }
        CuisineScroller scroller1 = new CuisineScroller();
        scroller1.setArguments(args1);
        getSupportFragmentManager().beginTransaction().add(R.id.main_scroll_container, scroller1).commit();


        // Mediterranean
        Bundle args2 = new Bundle();
        args2.putString("cuisine", "Mediterranean");
        for (int i = 0; i < 3; i++) {
            args2.putInt(String.valueOf(i), dishpics[8][i]);
        }
        CuisineScroller scroller2 = new CuisineScroller();
        scroller2.setArguments(args2);
        getSupportFragmentManager().beginTransaction().add(R.id.main_scroll_container, scroller2).commit();


        // Japanese
        Bundle args3 = new Bundle();
        args3.putString("cuisine", "Japanese");
        for (int i = 0; i < 3; i++) {
            args3.putInt(String.valueOf(i), dishpics[7][i]);
        }
        CuisineScroller scroller3 = new CuisineScroller();
        scroller3.setArguments(args3);
        getSupportFragmentManager().beginTransaction().add(R.id.main_scroll_container, scroller3).commit();

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
                Intent j = new Intent(MainActivity.this, SearchForm.class);
                startActivity(j);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
