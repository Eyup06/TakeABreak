package com.eyupyilmaz.takeabreak.CountryActivities;

import android.os.Bundle;

import com.eyupyilmaz.takeabreak.CountriesAdapter.EthiopiaSliderAdapter;
import com.eyupyilmaz.takeabreak.DrawerBaseActivity;
import com.eyupyilmaz.takeabreak.R;
import com.eyupyilmaz.takeabreak.databinding.ActivityEthiopiaBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class EthiopiaActivity extends DrawerBaseActivity {

    private SliderView EthiopiaSliderView;

    int[] ethiopiaImage = {R.drawable.ethiopia1,R.drawable.ethiopia22,R.drawable.ethiopia33,
    R.drawable.ethiopia5,R.drawable.ethiopia6,R.drawable.ethiopia7};

    ActivityEthiopiaBinding activityEthiopiaBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityEthiopiaBinding = ActivityEthiopiaBinding.inflate(getLayoutInflater());
        setContentView(activityEthiopiaBinding.getRoot());
        allocateActivityTitle("Ethiopia");

        EthiopiaSliderView = findViewById(R.id.EthiopiaSliderView);

        EthiopiaSliderAdapter ethiopiaSliderAdapter = new EthiopiaSliderAdapter(ethiopiaImage);

        EthiopiaSliderView.setSliderAdapter(ethiopiaSliderAdapter);
        EthiopiaSliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        EthiopiaSliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        EthiopiaSliderView.startAutoCycle();
    }
}