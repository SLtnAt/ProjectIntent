package com.example.projectintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void data_signal(View view){
        Intent intent = new Intent(MainActivity.this, SignalActivity_1.class);
        startActivity(intent);
    }

    public void airplane_mode(View view){
        Intent intent = new Intent(MainActivity.this, AirplaneActivity_2.class);
        startActivity(intent);
    }

    public void alarm(View view){
        Intent intent = new Intent(MainActivity.this, AlarmActivity_3.class);
        startActivity(intent);
    }

    public void block_notif(View view){
        Intent intent = new Intent(MainActivity.this, BlockActivity_4.class);
        startActivity(intent);
    }

    public void bluetooth(View view){
        Intent intent = new Intent(MainActivity.this, BluetoothActivity_5.class);
        startActivity(intent);
    }

    public void camera(View view){
        Intent intent = new Intent(MainActivity.this, CameraActivity_6.class);
        startActivity(intent);
    }

    public void flashlight(View view){
        Intent intent = new Intent(MainActivity.this, FlashActivity_7.class);
        startActivity(intent);
    }

    public void location(View view){
        Intent intent = new Intent(MainActivity.this, LocationActivity_8.class);
        startActivity(intent);
    }

    public void rotation(View view){
        Intent intent = new Intent(MainActivity.this, RotationActivity_9.class);
        startActivity(intent);
    }
}