package com.eyupyilmaz.takeabreak.CountryActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eyupyilmaz.takeabreak.CountriesAdapter.VietnamSliderAdapter;
import com.eyupyilmaz.takeabreak.DrawerBaseActivity;
import com.eyupyilmaz.takeabreak.R;
import com.eyupyilmaz.takeabreak.databinding.ActivityVietnamBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class VietnamActivity extends DrawerBaseActivity {

    private SliderView sliderVietnam;

    int[] vietnamImages = {R.drawable.vietnam1, R.drawable.vietnam2,R.drawable.vietnam3,
    R.drawable.vietnam4, R.drawable.vietnam5,R.drawable.vietnam6};
    ActivityVietnamBinding activityVietnamBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityVietnamBinding = ActivityVietnamBinding.inflate(getLayoutInflater());
        setContentView(activityVietnamBinding.getRoot());
        allocateActivityTitle("Vietnam");

        sliderVietnam = findViewById(R.id.vietnamSlider);

        VietnamSliderAdapter vietnamSliderAdapter = new VietnamSliderAdapter(vietnamImages);

        sliderVietnam.setSliderAdapter(vietnamSliderAdapter);
        sliderVietnam.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderVietnam.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderVietnam.startAutoCycle();



    }
}