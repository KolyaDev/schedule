package com.example.dmitriy.schedule40;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;import com.example.dmitriy.schedule40.R;

public class fourth_fragment extends Fragment {

    public static fourth_fragment newInstance(){
        fourth_fragment fourth = new fourth_fragment();
        return fourth;
    }

    public fourth_fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fourth_fragment,container,false);
        return rootView;
    }

}
