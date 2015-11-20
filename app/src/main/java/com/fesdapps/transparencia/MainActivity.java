package com.fesdapps.transparencia;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;



public class MainActivity extends Activity


       {
    private SensorManager mSensorManager;
    private float mAccel; // acceleration apart from gravity
    private float mAccelCurrent; // current acceleration including gravity
    private float mAccelLast; // las
    boolean isFirst=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout  menu = (LinearLayout) findViewById(R.id.menu_view);
        final ScrollView  questions = (ScrollView) findViewById(R.id.scroll_view);




        final Button button = (Button) findViewById(R.id.BT1);

        Button menu1 = (Button) findViewById(R.id.menu1);
        Button menu2 = (Button) findViewById(R.id.menu2);
        Button menu3 = (Button) findViewById(R.id.menu3);
        Button menu4 = (Button) findViewById(R.id.menu4);
        final Random randomGenerator = new Random();
        final ArrayList sample = new ArrayList() {{

            add(getResources().getString(R.string.pregunta1));
            add(getResources().getString(R.string.pregunta2));
            add(getResources().getString(R.string.pregunta3));
            add(getResources().getString(R.string.pregunta4));
            add(getResources().getString(R.string.pregunta5));
            add(getResources().getString(R.string.pregunta6));
            add(getResources().getString(R.string.pregunta7));
            add(getResources().getString(R.string.pregunta8));
            add(getResources().getString(R.string.pregunta9));
            add(getResources().getString(R.string.pregunta10));
            add(getResources().getString(R.string.pregunta11));
            add(getResources().getString(R.string.pregunta12));
            add(getResources().getString(R.string.pregunta13));
            add(getResources().getString(R.string.pregunta14));
            add(getResources().getString(R.string.pregunta15));
            add(getResources().getString(R.string.pregunta16));
            add(getResources().getString(R.string.pregunta17));
            add(getResources().getString(R.string.pregunta18));
            add(getResources().getString(R.string.pregunta19));
            add(getResources().getString(R.string.pregunta20));
            add(getResources().getString(R.string.pregunta21));
            add(getResources().getString(R.string.pregunta22));
            add(getResources().getString(R.string.pregunta23));
            add(getResources().getString(R.string.pregunta24));
            add(getResources().getString(R.string.pregunta25));
        }};
      menu1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              menu.setVisibility(View.GONE);
              questions.setVisibility(View.VISIBLE);
              mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
              mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
              mAccel = 0.00f;
              mAccelCurrent = SensorManager.GRAVITY_EARTH;
              mAccelLast = SensorManager.GRAVITY_EARTH;
          }
      });
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setVisibility(View.GONE);
                questions.setVisibility(View.VISIBLE);
                mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
                mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
                mAccel = 0.00f;
                mAccelCurrent = SensorManager.GRAVITY_EARTH;
                mAccelLast = SensorManager.GRAVITY_EARTH;
            }
        });
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setVisibility(View.GONE);
                questions.setVisibility(View.VISIBLE);
                mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
                mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
                mAccel = 0.00f;
                mAccelCurrent = SensorManager.GRAVITY_EARTH;
                mAccelLast = SensorManager.GRAVITY_EARTH;
            }
        });
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setVisibility(View.GONE);
                questions.setVisibility(View.VISIBLE);
                mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
                mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
                mAccel = 0.00f;
                mAccelCurrent = SensorManager.GRAVITY_EARTH;
                mAccelLast = SensorManager.GRAVITY_EARTH;
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //set the size of your list as the max number for your generator
                //get a random number and retrieve your element
                int index = randomGenerator.nextInt(sample.size());
                String item = String.valueOf( sample.get(index));
                //set your random element to a textview
                ((TextView) findViewById(R.id.TV3)).setText(item);
            }
        });

    }





           @Override
           protected void onResume() {
               super.onResume();
               mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
               mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
               mAccel = 0.00f;
               mAccelCurrent = SensorManager.GRAVITY_EARTH;
               mAccelLast = SensorManager.GRAVITY_EARTH;
               mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
           }

           @Override
           protected void onPause() {
               mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
               mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
               mAccel = 0.00f;
               mAccelCurrent = SensorManager.GRAVITY_EARTH;
               mAccelLast = SensorManager.GRAVITY_EARTH;
               mSensorManager.unregisterListener(mSensorListener);
               super.onPause();
           }


           final SensorEventListener mSensorListener = new SensorEventListener() {
               @Override
               public void onSensorChanged(SensorEvent event) {
                   float x = event.values[0];
                   float y = event.values[1];
                   float z = event.values[2];
                   mAccelLast = mAccelCurrent;
                   mAccelCurrent = (float) Math.sqrt((double) (x * x + y * y + z * z));
                   float delta = mAccelCurrent - mAccelLast;
                   mAccel = mAccel * 0.9f + delta; // perform low-cut filter
                   if (mAccel > 4) {
                       final Random randomGenerator = new Random();
                       final ArrayList sample = new ArrayList() {{

                           add(getResources().getString(R.string.pregunta1));
                           add(getResources().getString(R.string.pregunta2));
                           add(getResources().getString(R.string.pregunta3));
                           add(getResources().getString(R.string.pregunta4));
                           add(getResources().getString(R.string.pregunta5));
                           add(getResources().getString(R.string.pregunta6));
                           add(getResources().getString(R.string.pregunta7));
                           add(getResources().getString(R.string.pregunta8));
                           add(getResources().getString(R.string.pregunta9));
                           add(getResources().getString(R.string.pregunta10));
                           add(getResources().getString(R.string.pregunta11));
                           add(getResources().getString(R.string.pregunta12));
                           add(getResources().getString(R.string.pregunta13));
                           add(getResources().getString(R.string.pregunta14));
                           add(getResources().getString(R.string.pregunta15));
                           add(getResources().getString(R.string.pregunta16));
                           add(getResources().getString(R.string.pregunta17));
                           add(getResources().getString(R.string.pregunta18));
                           add(getResources().getString(R.string.pregunta19));
                           add(getResources().getString(R.string.pregunta20));
                           add(getResources().getString(R.string.pregunta21));
                           add(getResources().getString(R.string.pregunta22));
                           add(getResources().getString(R.string.pregunta23));
                           add(getResources().getString(R.string.pregunta24));
                           add(getResources().getString(R.string.pregunta25));

                       }};
                       String item = String.valueOf(sample.get(randomGenerator.nextInt(sample.size())));
                       //set your random element to a textview
                       ((TextView) findViewById(R.id.TV3)).setText(item);
                   }
               }

               @Override
               public void onAccuracyChanged(Sensor sensor, int accuracy) {
               }

           };


           @Override
           public void onBackPressed() {
               if(!isFirst){
                   LinearLayout  menu = (LinearLayout) findViewById(R.id.menu_view);
                   ScrollView  questions = (ScrollView) findViewById(R.id.scroll_view);
                   menu.setVisibility(View.VISIBLE);
                   questions.setVisibility(View.GONE);
                   isFirst = true;
               }
               else{
                   isFirst = false;
                   super.onBackPressed();
               }
           }
       }
