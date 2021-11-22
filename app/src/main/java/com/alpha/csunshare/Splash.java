package com.alpha.csunshare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import static java.lang.Thread.sleep;


public class Splash extends AppCompatActivity
{
    ImageView imageView;
    TextView textView ;
    Animation top , bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


            ///Splash Screen
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            imageView = findViewById(R.id.logo);
            textView = findViewById(R.id.phoenix);

            top = AnimationUtils.loadAnimation(this, R.anim.top);
            bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);
            imageView.setAnimation(top);
            textView.setAnimation(bottom);

            //Splash Screen
            Thread myThread = new Thread(new Runnable() {
                @Override
                public void run() {

                    try {

                        sleep(1800);
                        Intent intent = new Intent(Splash.this, MainActivity.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        finish();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

            myThread.start();


        }


}