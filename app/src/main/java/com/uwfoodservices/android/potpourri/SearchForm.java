package com.uwfoodservices.android.potpourri;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.view.View;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_form);
    }

    public void onPriceClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_price1:
                if (checked){

                }
            case R.id.checkbox_price2:
                if (checked){

                }
            case R.id.checkbox_price3:
                if (checked){

                }
            case R.id.checkbox_price4:
                if (checked){

                }
        }
    }

    public void onDistanceClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.distance1:
                if (checked){
                    Intent i = new Intent(SearchForm.this, SearchResults.class);
                    startActivity(i);
                }
            case R.id.distance2:
                if (checked){

                }
            case R.id.distance3:
                if (checked){

                }
            case R.id.distance4:
                if (checked){

                }
        }
    }
    public void onFoodClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.foodtype1:
                if (checked){
                    Intent i = new Intent(SearchForm.this, SearchResults.class);
                    startActivity(i);
                }
            case R.id.foodtype2:
                if (checked){

                }
            case R.id.foodtype3:
                if (checked){

                }
            case R.id.foodtype4:
                if (checked){

                }
            case R.id.foodtype5:
                if (checked){

                }
            case R.id.foodtype6:
                if (checked){

                }
            case R.id.foodtype7:
                if (checked){

                }
            case R.id.foodtype8:
                if (checked){

                }
            case R.id.foodtype9:
                if (checked){

                }
            case R.id.foodtype10:
                if (checked){

                }
            case R.id.foodtype11:
                if (checked){

                }
            case R.id.foodtype12:
                if (checked){

                }
            case R.id.foodtype13:
                if (checked){

                }
        }
    }

    public void onDietClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()){
            case R.id.diet1:
                if (checked){
                    Intent i = new Intent(SearchForm.this, SearchResults.class);
                    startActivity(i);
                }
            case R.id.diet2:
                if (checked){

                }
            case R.id.diet3:
                if (checked){

                }
            case R.id.diet4:
                if (checked){

                }
            case R.id.diet5:
                if (checked){

                }
            case R.id.diet6:
                if (checked){

                }
            case R.id.diet7:
                if (checked){

                }
            case R.id.diet8:
                if (checked){

                }
            case R.id.diet9:
                if (checked){

                }
        }
    }
    public void onHealthyClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.healthy:
                if (checked){
                    Intent i = new Intent(SearchForm.this, SearchResults.class);
                    startActivity(i);
                    finish();
                }
        }

    }
}