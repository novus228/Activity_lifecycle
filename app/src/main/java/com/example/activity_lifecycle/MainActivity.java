package com.example.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("states","onCreate() method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("states","onStart() method");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("states","onResume() method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("states","onPause() method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("states","onStop() method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("states","onRestart() method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("states","onDestroy() method");
    }
}