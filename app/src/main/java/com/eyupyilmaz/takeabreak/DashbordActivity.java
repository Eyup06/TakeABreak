package com.eyupyilmaz.takeabreak;

import androidx.annotation.NonNull;

import android.os.Bundle;


import com.eyupyilmaz.takeabreak.databinding.ActivityDashbordBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class DashbordActivity extends DrawerBaseActivity {


    ActivityDashbordBinding activityDashbordBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDashbordBinding = ActivityDashbordBinding.inflate(getLayoutInflater());
        setContentView(activityDashbordBinding.getRoot());
        allocateActivityTitle("Dashbord");


        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        thread.start();





    }
}