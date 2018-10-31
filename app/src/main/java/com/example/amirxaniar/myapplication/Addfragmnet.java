package com.example.amirxaniar.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Addfragmnet extends Fragment {


    public Addfragmnet() {
        // Required empty public constructor

    }

LinearLayout linearLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_addfragmnet, container, false);


    }



}
