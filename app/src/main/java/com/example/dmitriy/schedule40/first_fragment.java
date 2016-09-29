package com.example.dmitriy.schedule40;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class first_fragment extends Fragment {
    String dayOfTheWeeks;
    int hourOfTheDay;
    TextView text;

    public first_fragment(){

    }

    public static first_fragment newInstance() {
        first_fragment first = new first_fragment();
        return first;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.first_fragment,container,false);

        SimpleDateFormat sdfs = new SimpleDateFormat("H");
        Date d = new Date();


        hourOfTheDay = Integer.parseInt(sdfs.format(d));
        //dayOfTheWeeks = (new SimpleDateFormat ( "EEEE" ).format ( new Date() ));
        //text = (TextView)rootView.findViewById(R.id.textFirst);
        //text.setText((hourOfTheDay + ""));
        return rootView;
    }


}
