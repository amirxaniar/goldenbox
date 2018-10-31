package com.example.amirxaniar.myapplication;

import android.content.Intent;

import android.net.Uri;
import android.provider.MediaStore;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends  AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private DrawerLayout mDrawerLayout;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);






        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);


        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        int id = menuItem.getItemId();

                               if(id== R.id.nav_manage5){


                                Intent i = new Intent(MapsActivity.this, MainActivity.class);
                                startActivity(i);}
                                else if(id== R.id.nav_gallery){

                                     Intent i1 = new Intent(MapsActivity.this, Main2Activity.class);
                                      startActivity(i1);}
                               else if(id== R.id.nav_manage3){

                                   Intent i11 = new Intent(MapsActivity.this, rent_contract.class);
                                   startActivity(i11);}
                               else if(id== R.id.nav_manage4){

                                   Intent i12 = new Intent(MapsActivity.this, buy_contract.class);
                                   startActivity(i12);}
                               else if(id== R.id.nav_camera){


                                  Intent i2 = new Intent(MapsActivity.this, Main3Activity.class);
                                   startActivity(i2);
                    }

                            // close drawer when item is tapped
                            mDrawerLayout.closeDrawers();

                            // Add code here to update the UI based on the item selected
                            // For example, swap UI fragments here

                            return true;
                        }

                });
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);









    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
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
        LatLng sydney = new LatLng(35.699005,51.343188);
        mMap.addMarker(new MarkerOptions().position(sydney).title("50 متر  نوساز یک خوابه 100 رهن کامل"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.setMinZoomPreference(11);




    }
}
