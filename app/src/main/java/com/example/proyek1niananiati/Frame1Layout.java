package com.example.proyek1niananiati;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Frame1Layout extends AppCompatActivity {
    ImageView gambarloading;
    Animation rotasiAnimasi;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame1_layout);
        gambarloading=findViewById(R.id.loading);
        rotasi();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Frame1Layout.this,Frame2Layout.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }

    private void rotasi() {
        rotasiAnimasi = AnimationUtils.loadAnimation(this,R.anim.rotasi_searah);
        gambarloading.startAnimation(rotasiAnimasi);
    }
}