package com.eyupyilmaz.takeabreak.CountryActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eyupyilmaz.takeabreak.CountriesAdapter.GuatamalaSliderAdapter;
import com.eyupyilmaz.takeabreak.DrawerBaseActivity;
import com.eyupyilmaz.takeabreak.R;
import com.eyupyilmaz.takeabreak.databinding.ActivityGuatamalaBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class GuatamalaActivity extends DrawerBaseActivity {

    private SliderView GuatemalaSliderView;

    int[] GuatemalaImage = {R.drawable.guatamala33,R.drawable.guatamala44,R.drawable.guatamala55,
    R.drawable.guatamala66,R.drawable.guatamala77};

    ActivityGuatamalaBinding activityGuatamalaBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityGuatamalaBinding = ActivityGuatamalaBinding.inflate(getLayoutInflater());
        setContentView(activityGuatamalaBinding.getRoot());
        allocateActivityTitle("Guatamala");

        GuatemalaSliderView = findViewById(R.id.GuatemalaSliderView);

        GuatamalaSliderAdapter guatamalaSliderAdapter = new GuatamalaSliderAdapter(GuatemalaImage);

        GuatemalaSliderView.setSliderAdapter(guatamalaSliderAdapter);
        GuatemalaSliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        GuatemalaSliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        GuatemalaSliderView.startAutoCycle();

    }
}