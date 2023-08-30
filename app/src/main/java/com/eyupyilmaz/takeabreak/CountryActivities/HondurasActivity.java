package com.eyupyilmaz.takeabreak.CountryActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eyupyilmaz.takeabreak.CountriesAdapter.HondurasSliderAdapter;
import com.eyupyilmaz.takeabreak.DrawerBaseActivity;
import com.eyupyilmaz.takeabreak.R;
import com.eyupyilmaz.takeabreak.databinding.ActivityHondurasBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class HondurasActivity extends DrawerBaseActivity {

    private SliderView HondurasSliderView;

    int[] hondurasImage = {R.drawable.hondurascoffee1,R.drawable.hondurascoffee2,
    R.drawable.hondurascoffee3,R.drawable.hondurascoffee4,R.drawable.hondurascoffee5};

    ActivityHondurasBinding activityHondurasBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHondurasBinding = ActivityHondurasBinding.inflate(getLayoutInflater());
        setContentView(activityHondurasBinding.getRoot());
        allocateActivityTitle("Honduras");

        HondurasSliderView = findViewById(R.id.sliderViewHonduras);

        HondurasSliderAdapter hondurasSliderAdapter = new HondurasSliderAdapter(hondurasImage);

        HondurasSliderView.setSliderAdapter(hondurasSliderAdapter);
        HondurasSliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        HondurasSliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        HondurasSliderView.startAutoCycle();


    }
}