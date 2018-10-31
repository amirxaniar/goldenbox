package com.example.amirxaniar.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    public static  final int CAMERA_REQUEST=9999;
    public static  final int CAMERA_REQUEST1=9998;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView1 =findViewById(R.id.imageView1);
        imageView2 =findViewById(R.id.imageView2);
    }
    public  void  openCamera1(View view){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMERA_REQUEST);
    }
    public  void  openCamera2(View view){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMERA_REQUEST1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CAMERA_REQUEST) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imageView1.setImageBitmap(bitmap);

        }else {

                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                imageView2.setImageBitmap(bitmap);
            }
        }

    }



