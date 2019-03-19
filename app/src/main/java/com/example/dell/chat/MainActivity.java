package com.example.dell.chat;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        Intent myIntent = new Intent(MainActivity.this,
                Login.class);
        startActivity(myIntent);
    }

}