package uwfood.foodpreference;
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

public class FoodForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_form);
        CheckBox price1 = (CheckBox) findViewById(R.id.checkbox_price1);
        CheckBox price2 = (CheckBox) findViewById(R.id.checkbox_price2);
        CheckBox price3 = (CheckBox) findViewById(R.id.checkbox_price3);
        CheckBox price4 = (CheckBox) findViewById(R.id.checkbox_price4);
        if(price1.isChecked()){

        }
        if(price2.isChecked()){

        }
        if(price3.isChecked()){

        }
        if(price4.isChecked()){

        }
    }

    @Override
    public void onResume() {
        super.onResume();
        //Get a Tracker (should auto-report)


    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }
    public void onPriceClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_price1:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.checkbox_price2:
                if (checked){

                }
            case R.id.checkbox_price3:
                if (checked){

                }
                // Put some meat on the sandwich

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

                }
                // Put some meat on the sandwich

            case R.id.foodtype2:
                if (checked){

                }
            case R.id.foodtype3:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.foodtype4:
                if (checked){

                }
            case R.id.foodtype5:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.foodtype6:
                if (checked){

                }
            case R.id.foodtype7:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.foodtype8:
                if (checked){

                }
            case R.id.foodtype9:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.foodtype10:
                if (checked){

                }
            case R.id.foodtype11:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.foodtype12:
                if (checked){

                }
            case R.id.foodtype13:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.foodtype14:
                if (checked){

                }
            case R.id.foodtype15:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.foodtype16:
                if (checked){

                }
            case R.id.foodtype17:
                if (checked){

                }
        }
    }

    public void onDietClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.diet1:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.diet2:
                if (checked){

                }
            case R.id.diet3:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.diet4:
                if (checked){

                }
            case R.id.diet5:
                if (checked){

                }
                // Put some meat on the sandwich

            case R.id.diet6:
                if (checked){

                }
            case R.id.diet7:
                if (checked){

                }
                // Put some meat on the sandwich

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

                }


        }

    }
}
