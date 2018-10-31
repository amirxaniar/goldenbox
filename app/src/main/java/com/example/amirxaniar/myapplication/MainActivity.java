package com.example.amirxaniar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.content.Intent;
import android.graphics.Bitmap;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    ImageView imageView10;
    public static  final int CAMERA_REQUEST=9997;



    private FrameLayout frameLayout;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new HomeFragment()).commit();

                    return true;
                case R.id.navigation_dashboard:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new Addfragmnet()).commit();

                    return true;
                case R.id.navigation_notifications:

                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new NotificationFragment()).commit();
                    return true;
            }
            return false;
        }


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView10 =findViewById(R.id.imageView10);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new HomeFragment()).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        frameLayout = findViewById(R.id.main_frame);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
    public  void  openCamera10(View view){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMERA_REQUEST);
    }



public void  bclick(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line1);
        linearLayout1.setVisibility(view.VISIBLE);

}
    public void  b1click(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line1);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b2click(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line1);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b3click(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line1);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b4click(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line1);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b5click(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line1);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b6click(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line1);
        linearLayout1.setVisibility(view.INVISIBLE);

    }

    public void  bclick1(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line11);
        linearLayout1.setVisibility(view.VISIBLE);

    }
    public void  b1click1(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line11);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b2click1(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line11);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b3click1(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line11);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b4click1(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line11);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b5click1(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line11);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  b6click1(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.line11);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  dclick(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.daste1);
        linearLayout1.setVisibility(view.VISIBLE);

    }
    public void  dclick1(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.daste1);
        linearLayout1.setVisibility(view.INVISIBLE);

    }
    public void  dclick2(View view){
        LinearLayout linearLayout1;
        linearLayout1 =findViewById(R.id.daste1);
        linearLayout1.setVisibility(view.INVISIBLE);

    }

}
