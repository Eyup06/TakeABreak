package com.eyupyilmaz.takeabreak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.eyupyilmaz.takeabreak.CountriesAdapter.SettingsActivity;
import com.eyupyilmaz.takeabreak.databinding.ActivityEditProfileBinding;

public class EditProfile extends AppCompatActivity {

    private ActivityEditProfileBinding binding;


    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "my_pref";
    private static final String KEY_NAME = "userName";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PASSWORD = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditProfileBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String userName = sharedPreferences.getString(KEY_NAME,null);
        String email = sharedPreferences.getString(KEY_EMAIL,null);
        String password = sharedPreferences.getString(KEY_PASSWORD,null);
        String userName2 = sharedPreferences.getString(KEY_NAME,null);

        if (userName != null || email != null || password != null || userName2 != null){
            binding.editProfileUsername.setText(userName2);
            binding.etProfileUsername.setText(userName);
            binding.etProfileEmail.setText(email);
            binding.etProfilePassword.setText(password);
        }

        binding.imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditProfile.this, SettingsActivity.class);
                startActivity(intent);
            }
        });


    }


}