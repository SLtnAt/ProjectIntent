package com.example.projectintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RotationActivity_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation9);
    }
    public void kembali(View view) {
        Intent intent = new Intent(RotationActivity_9.this, MainActivity.class);
        finish();
    }
}