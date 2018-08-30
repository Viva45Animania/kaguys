package com.kaguys.touringkaga;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


//public class StampActivity extends Fragment {
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        //returning our layout file
//        //change R.layout.yourlayoutfilename for each of your fragments
//        return inflater.inflate(R.layout.activity_stamp, container, false);
//    }
//
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        //you can set the title for your toolbar here for different fragments different titles
//        getActivity().setTitle("Stamps");
//    }
//}
public class StampActivity extends AppCompatActivity {

    ImageButton stamp1,stamp2,stamp3,stamp4,stamp5,stamp6,stamp7,stamp8,stamp9,stamp10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stamp);

        stamp1 = findViewById(R.id.imageButton);
        stamp2 = findViewById(R.id.imageButton2);
        stamp3 = findViewById(R.id.imageButton3);
        stamp4 = findViewById(R.id.imageButton4);
        stamp5 = findViewById(R.id.imageButton5);
        stamp6 = findViewById(R.id.imageButton6);
        stamp7 = findViewById(R.id.imageButton7);
        stamp8 = findViewById(R.id.imageButton8);
        stamp9 = findViewById(R.id.imageButton9);
        stamp10 = findViewById(R.id.imageButton10);
    }
}