package com.uwfoodservices.android.potpourri;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
        cuisineTitle.setText("Cuisine " + getArguments().getInt("index"));

        Button see_more_button = v.findViewById(R.id.see_more_button);

        Button button1 = new Button(getContext());
        button1.setText("FRAME 1");
        button1.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(button1);

        Button button2 = new Button(getContext());
        button2.setText("FRAME 2");
        button2.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(button2);

        Button button3 = new Button(getContext());
        button3.setText("FRAME 3");
        button3.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(button3);

        Button button4 = new Button(getContext());
        button4.setText("FRAME 4");
        button4.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(button4);

        Button button5 = new Button(getContext());
        button5.setText("FRAME 5");
        button5.setLayoutParams(new LinearLayout.LayoutParams(500, 500));
        sidescroll.addView(button5);

        return v;
    }
}
