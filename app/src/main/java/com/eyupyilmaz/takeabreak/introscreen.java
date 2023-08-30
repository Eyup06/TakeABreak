package com.eyupyilmaz.takeabreak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eyupyilmaz.takeabreak.databinding.ActivityIntroscreenBinding;

public class introscreen extends AppCompatActivity {

    private ActivityIntroscreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroscreenBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(introscreen.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}