package com.fesdapps.transparencia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;

/**
 * Created by INNOVA1 on 22/04/2015.
 */
public class splash extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);

        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(splash.this, MainActivity.class));
                finish();
            }
        }, secondsDelayed * 3000);
    }
}

