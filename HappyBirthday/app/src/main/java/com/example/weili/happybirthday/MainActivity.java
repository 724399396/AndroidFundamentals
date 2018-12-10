package com.example.weili.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            Log.e("MainActivity", "bad thing happen", e);
        }
    }
}
