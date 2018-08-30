package com.example.hirotoshi.forum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private String[] myDataset = new String[26];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);
        String[] myRecom = new String[26];
        myRecom[0] = "[Heihachi]\n Yamashiro's perfect lunch destination";
        myRecom[1] = "[Kaiseki Nakao]\n A stylish restaurant you'll want to visit again";
        myRecom[2] = "[Kappo Kaga]\n Japanese culsine with local roots";
        myRecom[3] = "[Otowado]\n Japanese sweets";
        myRecom[12] = "[Shimotsune]\n Maker of fine Japanese sweets since 1900";
        myRecom[13] = "[Patisserie Keln]\n The perfect place for delicions bread and cake!";
        myRecom[14] = "[Marufuku]\n A sweets shop on Onsen-dori Shopping Street Boasting over 80 years of history";
        myRecom[15] = "[Cake&cafe PONY]\n Cafe and cake shop";
        myRecom[16] = "[Reno-no yokan]\n Yamashiro Onsen's famous noer-yokan sweets";
        myRecom[17] = "[Yokoya]\n Offering exclusive Japanese sweets";
        myRecom[18] = "[Sohachi]\n Simple, natural, and delicious";
        myRecom[19] = "[Utsuwa-gura Ceramics]\n A comfortable and quaint ceramics shop";
        myRecom[20] = "[Minamide Toen Ceramics]\n Experience the joy of colors with Kutaniyaki";
        myRecom[21] = "[Kutani Bitouen]\n Create your own traditional Kutaniyaki ceramics";
        myRecom[22] = "[Kutani ware ASAHIYA]\n Kutaniyaki, Japan's foremost colored ceramics";
        myRecom[23] = "[COCKTAIL Bar SWING]\n Kaga Onsen's preeminent jazz cocktail bar";
        myRecom[24] = "[kitchen bar lamp]\n Counter-seat-only Italian bar";
        myRecom[25] = "[Soyu-baiten]\n Charming hot spring sweets";
        myRecom[4] = "[Kappo Kawaguchi]\n Shop drifting emotion of the sum";
        myRecom[5] = "[Gallery & Bistro Bengaraya]\n Traditional beauty meets modern style";
        myRecom[6] = "[Kyusen]\n The home of Ishikawa's traditional kaki-on-ha (persimmon leaf) sushi";
        myRecom[7] = "[Ichiriki]\n Japanese home food and side dishes";
        myRecom[8] = "[Korean-House YMASHIRO]\n Korean food and barbecue";
        myRecom[9] = "[Genki-ya]\n Offering the best of deli and produce shop";
        myRecom[10] = "[Rock Diner Kadoya-Shokudo]\n Watch out the fire in Rock soul";
        myRecom[11] = "[Foods Shop Kuwabara]\n Fresh seafood available daily!";

        for(int i=0; i<myDataset.length; i++) {
            myDataset[i] = "---Recomendation Top 0" + String.valueOf(i+1)+"---\n"+myRecom[i];
        }

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

    /** Called when the user taps the Send button*/
    /*public void sendMessage(View view){
        //Do something in response to button
        /*Intent intent = new Intent(this, MainActivity.class);

        mRecyclerView = findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        EditText editText = (EditText) findViewById(R.id.editText);
        String[] message = new String[1];
        message[0] = editText.getText().toString();
        mAdapter = new MyAdapter(message);
        mRecyclerView.setAdapter(mAdapter);
        /*intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }*/
    // Get the Intent that started this activity and extract the string
    //Intent intent = getIntent();
    //String message = intent.getStringExtra(EXTRA_MESSAGE);

    // Capture the layout's TextView and set the string as its text
    //TextView textView = findViewById(R.id.textView);
    //textView.setText(message);

}
