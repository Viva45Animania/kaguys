package com.kaguys.touringkaga;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecommendationActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private String[] myDataset = new String[6];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);

        mRecyclerView = findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);
        String[] myRecom = new String[26];
        myRecom[0] = "[Heihachi]";
        myRecom[1] = "[Kaiseki Nakao]";
        myRecom[2] = "[Kappo Kaga]";
        myRecom[3] = "[Otowado]";
        myRecom[4] = "[Kappo Kawaguchi]";
        myRecom[5] = "[Gallery & Bistro Bengaraya]";

        for(int i=0; i<myDataset.length; i++) {
            myDataset[i] = "---Recomendation Top 0" + String.valueOf(i+1)+"---\n"+myRecom[i];
        }

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
