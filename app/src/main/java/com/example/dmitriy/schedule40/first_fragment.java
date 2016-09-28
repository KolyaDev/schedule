package com.example.dmitriy.schedule40;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;import com.example.dmitriy.schedule40.R;

public class first_fragment extends Fragment {
    String dayOfTheWeeks;
    public static first_fragment newInstance(){
        first_fragment first = new first_fragment();
        return first;
    }

    public first_fragment(){

    }

    TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.first_fragment,container,false);

        //SimpleDateFormat sdfs = new SimpleDateFormat("uuuu", Locale.getDefault());
        //Date d = new Date();


        //dayOfTheWeeks = (new SimpleDateFormat ( "EEEE" ).format ( new Date() ));
        //text = (TextView)rootView.findViewById(R.id.textFirst);
        //text.setText(dayOfTheWeeks);
        return rootView;
    }


}
