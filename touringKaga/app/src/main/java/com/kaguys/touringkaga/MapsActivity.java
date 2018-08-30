package com.kaguys.touringkaga;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng kagaTouristInfo = new LatLng(36.3196, 136.3509);
        mMap.addMarker(new MarkerOptions().position(kagaTouristInfo).title("Kaga City Tourist Information Center"));
        LatLng yamanakaOnsen = new LatLng(36.2498, 136.3756);
        mMap.addMarker(new MarkerOptions().position(yamanakaOnsen).title("Yamanaka Onsen"));
        LatLng kakusenkaiGorge = new LatLng(36.2430, 136.3725);
        mMap.addMarker(new MarkerOptions().position(kakusenkaiGorge).title("Kakusenkai Gorge"));
        LatLng korogibashiBridge = new LatLng(36.2410, 136.3716);
        mMap.addMarker(new MarkerOptions().position(korogibashiBridge).title("Korogi-bashi Bridge"));
        LatLng yamashiroOnsen = new LatLng(36.2973438, 136.3435488);
        mMap.addMarker(new MarkerOptions().position(yamashiroOnsen).title("Yamashiro Onsen"));
        LatLng ayatoriBridge = new LatLng(36.245470, 136.375723);
        mMap.addMarker(new MarkerOptions().position(ayatoriBridge).title("Ayatori Bridge"));
        LatLng lacquerware = new LatLng(36.2559, 136.3719);
        mMap.addMarker(new MarkerOptions().position(lacquerware).title("Ishikawa Prefectural Institute for Yamanaka Lacquer Ware （Ishikawa Prefectural Training Institute of Woodturning）"));


        CameraUpdate zoom=CameraUpdateFactory.zoomTo(11);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kagaTouristInfo));
        mMap.animateCamera(zoom);
    }
}
