package com.eyupyilmaz.takeabreak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Switch;

import com.eyupyilmaz.takeabreak.CountriesAdapter.SettingsActivity;
import com.eyupyilmaz.takeabreak.CountryActivities.BrazilActivity;
import com.eyupyilmaz.takeabreak.CountryActivities.ColombiaActivity;
import com.eyupyilmaz.takeabreak.CountryActivities.EthiopiaActivity;
import com.eyupyilmaz.takeabreak.CountryActivities.GuatamalaActivity;
import com.eyupyilmaz.takeabreak.CountryActivities.HondurasActivity;
import com.eyupyilmaz.takeabreak.CountryActivities.VietnamActivity;
import com.google.android.material.navigation.NavigationView;


public class DrawerBaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;

    @Override
    public void setContentView(View view) {
        drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_drawer_base,null);
        FrameLayout container = drawerLayout.findViewById(R.id.activityContainer);
        container.addView(view);
        super.setContentView(drawerLayout);

        Toolbar toolbar = drawerLayout.findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = drawerLayout.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.menu_drawer_open,R.string.menu_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()){
            case R.id.nav_brazilian:
                startActivity(new Intent(this, BrazilActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_colombia:
                startActivity(new Intent(this, ColombiaActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_ethiopia:
                startActivity(new Intent(this, EthiopiaActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_guatamala:
                startActivity(new Intent(this, GuatamalaActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_honduras:
                startActivity(new Intent(this, HondurasActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_vietnam:
                startActivity(new Intent(this, VietnamActivity.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                overridePendingTransition(0,0);
                break;

        }
        return false;
    }

    protected void allocateActivityTitle(String titleString){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(titleString);
        }
    }



}