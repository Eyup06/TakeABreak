package com.eyupyilmaz.takeabreak.CountryActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eyupyilmaz.takeabreak.CountriesAdapter.ColombiaSliderAdapter;
import com.eyupyilmaz.takeabreak.DrawerBaseActivity;
import com.eyupyilmaz.takeabreak.R;
import com.eyupyilmaz.takeabreak.databinding.ActivityColombiaBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class ColombiaActivity extends DrawerBaseActivity {

    private SliderView colombiaSliderView;

    int[] colombiaImage = {R.drawable.colombia02,R.drawable.colombia03,
    R.drawable.colombiabogotaregion,R.drawable.colombiailk};
    ActivityColombiaBinding activityColombiaBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityColombiaBinding = ActivityColombiaBinding.inflate(getLayoutInflater());
        setContentView(activityColombiaBinding.getRoot());
        allocateActivityTitle("Colombia");

        colombiaSliderView = findViewById(R.id.colombiaSliderView);

        ColombiaSliderAdapter colombiaSliderAdapter = new ColombiaSliderAdapter(colombiaImage);

        colombiaSliderView.setSliderAdapter(colombiaSliderAdapter);
        colombiaSliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        colombiaSliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        colombiaSliderView.startAutoCycle();
    }
}