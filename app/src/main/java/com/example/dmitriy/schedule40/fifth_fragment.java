package com.example.dmitriy.schedule40;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dmitriy.schedule40.R;import java.text.SimpleDateFormat;
import java.util.Date;

public class fifth_fragment extends Fragment {

    public static fifth_fragment newInstance(){
        fifth_fragment fifth = new fifth_fragment();
        return fifth;
    }

    public fifth_fragment(){

    }
    TextView fri_third;
    int dayOfTheWeek;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fifth_fragment,container,false);
        fri_third = (TextView)rootView.findViewById(R.id.textThird);

        SimpleDateFormat sdf = new SimpleDateFormat("w");
        Date d = new Date();
        dayOfTheWeek = Integer.valueOf(sdf.format(d));
        if (dayOfTheWeek % 2 == 0) fri_third.setText(R.string.fri_third1);
        else fri_third.setText(R.string.fri_third2);
        return rootView;

    }

}
