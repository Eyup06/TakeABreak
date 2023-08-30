package com.eyupyilmaz.takeabreak.CountriesAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.eyupyilmaz.takeabreak.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class VietnamSliderAdapter extends SliderViewAdapter<VietnamSliderAdapter.VietnamHolder> {

    int[] vietnamImages;

    public VietnamSliderAdapter(int[] vietnamImages) {
        this.vietnamImages = vietnamImages;
    }

    @Override
    public VietnamSliderAdapter.VietnamHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vietnam_slider_item,parent,false);
        return new VietnamHolder(view);
    }

    @Override
    public void onBindViewHolder(VietnamSliderAdapter.VietnamHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(vietnamImages[position]);
    }

    @Override
    public int getCount() {
        return vietnamImages.length;
    }

    public class VietnamHolder extends ViewHolder {
        ImageView imageView;
        public VietnamHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.VietnamImage);

        }
    }
}
