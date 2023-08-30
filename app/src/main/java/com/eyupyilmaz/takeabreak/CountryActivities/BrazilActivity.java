package com.eyupyilmaz.takeabreak.CountryActivities;

import android.os.Bundle;

import com.eyupyilmaz.takeabreak.DrawerBaseActivity;
import com.eyupyilmaz.takeabreak.R;
import com.eyupyilmaz.takeabreak.CountriesAdapter.SliderAdapter;
import com.eyupyilmaz.takeabreak.databinding.ActivityBrazilBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class BrazilActivity extends DrawerBaseActivity {


    private SliderView sliderView;

    int[] images ={R.drawable.brazilian1,R.drawable.brazilian2,
    R.drawable.brazilian3,R.drawable.brazilian4,
            R.drawable.brazilian5,R.drawable.brazilian6};

    ActivityBrazilBinding activityBrazilBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityBrazilBinding = ActivityBrazilBinding.inflate(getLayoutInflater());
        setContentView(activityBrazilBinding.getRoot());
        allocateActivityTitle("Brazil");

        sliderView = findViewById(R.id.sliderView);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }
}