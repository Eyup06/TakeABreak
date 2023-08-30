package com.eyupyilmaz.takeabreak;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseMessaging.getInstance().subscribeToTopic("Notification");

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3500);
                    startActivity(new Intent(MainActivity.this,introscreen.class));
                    finish();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };thread.start();

    }
}