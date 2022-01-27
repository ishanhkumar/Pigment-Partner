package com.example.colarity;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Camera;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Camera camera;
    FrameLayout frameLayout;
    ShowCamera showCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize frameLayout
        frameLayout = (FrameLayout)findViewById((R.id.frameLayout));

        // open camera
        camera = Camera.open();

        showCamera = new ShowCamera(this, camera);

        frameLayout.addView(showCamera);

    }

}