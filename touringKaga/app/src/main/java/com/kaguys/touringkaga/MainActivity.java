package com.kaguys.touringkaga;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declare UI
    Button buttonCamera;
    Button buttonMap;
    Button buttonForum;
    Button buttonStamp;
    Button buttonReccomendation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare UI
        buttonCamera = findViewById(R.id.buttonCamera);
        buttonMap = findViewById(R.id.buttonMap);
        buttonForum = findViewById(R.id.buttonForum);
        buttonStamp = findViewById(R.id.buttonStamp);
        buttonReccomendation = findViewById(R.id.buttonRecommendation);

        //on click listeners
        buttonCamera.setOnClickListener(this);
        buttonMap.setOnClickListener(this);
        buttonForum.setOnClickListener(this);
        buttonStamp.setOnClickListener(this);
        buttonReccomendation.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.buttonCamera:
                intent = new Intent(view.getContext(), CameraActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonMap:
                intent = new Intent(view.getContext(), MapsActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonForum:
                intent = new Intent(view.getContext(), ForumActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonStamp:
                intent = new Intent(view.getContext(),StampActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonRecommendation:
                intent = new Intent(view.getContext(),RecommendationActivity.class);
                startActivity(intent);
                break;
        }
    }

}
//        implements NavigationView.OnNavigationItemSelectedListener {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//
//        //add this line to display menu1 when the activity is loaded
//        displaySelectedScreen(R.id.map);
//    }
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    private void displaySelectedScreen(int itemId) {
//
//        //creating fragment object
//        Fragment fragment = null;
//
//        //initializing the fragment object which is selected
//        switch (itemId) {
//            case R.id.map:
//                fragment = new MapsActivity();
//                break;
//            case R.id.camera:
//                fragment = new Camera();
//                break;
//            case R.id.recommendation:
//                fragment = new Recommendation();
//                break;
//            case R.id.forum:
//                fragment = new Forum();
//                break;
//            case R.id.stamp:
//                fragment = new Stamp();
//                break;
//        }
//
//        //replacing the fragment
//        if (fragment != null) {
//            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//            ft.replace(R.id.content_frame, fragment);
//            ft.commit();
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here
//
//        displaySelectedScreen(item.getItemId());
//
//        return true;
//    }
//}
