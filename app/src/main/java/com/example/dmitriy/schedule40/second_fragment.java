package com.example.dmitriy.schedule40;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;import com.example.dmitriy.schedule40.R;

public class second_fragment extends Fragment {

    public static second_fragment newInstance(){
        second_fragment second = new second_fragment();
        return second;
    }

    public second_fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.second_fragment,container,false);
        return rootView;
    }

}
