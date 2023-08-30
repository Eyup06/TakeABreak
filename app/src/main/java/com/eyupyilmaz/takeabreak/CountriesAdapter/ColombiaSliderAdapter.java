package com.eyupyilmaz.takeabreak.CountriesAdapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.eyupyilmaz.takeabreak.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class ColombiaSliderAdapter extends SliderViewAdapter<ColombiaSliderAdapter.ColombiaHolder> {


    int[] colombiaImage;

    public ColombiaSliderAdapter(int[] colombiaImage) {
        this.colombiaImage = colombiaImage;
    }

    @Override
    public ColombiaSliderAdapter.ColombiaHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.colombia_slider_item,parent,false);
        return new ColombiaHolder(view);
    }

    @Override
    public void onBindViewHolder(ColombiaSliderAdapter.ColombiaHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(colombiaImage[position]);
    }

    @Override
    public int getCount() {
        return colombiaImage.length;
    }

    public class ColombiaHolder extends ViewHolder {

        ImageView imageView;
        public ColombiaHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.colombia_item);
        }
    }
}
