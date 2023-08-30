package com.eyupyilmaz.takeabreak.CountriesAdapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.eyupyilmaz.takeabreak.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class HondurasSliderAdapter extends SliderViewAdapter<HondurasSliderAdapter.HondurasHolder> {

    int[] hondurasImage;

    public HondurasSliderAdapter(int[] hondurasImage) {
        this.hondurasImage = hondurasImage;
    }

    @Override
    public HondurasHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.honduras_slider_item,parent,false);
        return new HondurasHolder(view);
    }

    @Override
    public void onBindViewHolder(HondurasHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(hondurasImage[position]);
    }

    @Override
    public int getCount() {
        return hondurasImage.length;
    }

    public class HondurasHolder extends ViewHolder {

        ImageView imageView;
        public HondurasHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.honduras_item);
        }
    }
}
