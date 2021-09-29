package com.example.projectintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignalActivity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signal1);
    }
    public void kembali(View view) {
        Intent intent = new Intent(SignalActivity_1.this, MainActivity.class);
        finish();
    }
}