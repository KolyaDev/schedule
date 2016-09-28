package com.example.dmitriy.schedule40;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;import com.example.dmitriy.schedule40.R;

public class third_fragment extends Fragment {

    public static third_fragment newInstance(){
        third_fragment third = new third_fragment();
        return third;
    }

    public third_fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.third_fragment,container,false);
        return rootView;
    }

}
