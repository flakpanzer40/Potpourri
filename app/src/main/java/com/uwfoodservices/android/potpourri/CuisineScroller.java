package com.uwfoodservices.android.potpourri;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CuisineScroller extends Fragment {

    public CuisineScroller() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_cuisine_scroller, container, false);

        LinearLayout sidescroll = v.findViewById(R.id.side_scroll_container);

        TextView cuisineTitle = v.findViewById(R.id.cuisine_title);
        cuisineTitle.setText(getArguments().getString("cuisine") + " Cuisine");

        Button see_more_button = v.findViewById(R.id.see_more_button);
        see_more_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), SearchResults.class);
                startActivity(i);
            }
        });

        ImageView image1 = new ImageView(getContext());
        image1.setImageResource(getArguments().getInt("0"));
        image1.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(image1);

        ImageView image2 = new ImageView(getContext());
        image2.setImageResource(getArguments().getInt("1"));
        image2.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(image2);

        ImageView image3 = new ImageView(getContext());
        image3.setImageResource(getArguments().getInt("2"));
        image3.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(image3);

        /*Button button5 = new Button(getContext());
        button5.setText("FRAME 5");
        button5.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(button5);*/

        return v;
    }
}
