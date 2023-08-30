package com.eyupyilmaz.takeabreak.CountriesAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.eyupyilmaz.takeabreak.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class EthiopiaSliderAdapter extends SliderViewAdapter<EthiopiaSliderAdapter.EthiopiaHolder> {

    int[] ethiopiaImage;

    public EthiopiaSliderAdapter(int[] ethiopiaImage) {
        this.ethiopiaImage = ethiopiaImage;
    }

    @Override
    public EthiopiaHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ethiopia_slider_item,parent,false);
        return new EthiopiaHolder(view);
    }

    @Override
    public void onBindViewHolder(EthiopiaHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(ethiopiaImage[position]);
    }

    @Override
    public int getCount() {
        return ethiopiaImage.length;
    }

    public class EthiopiaHolder extends ViewHolder {

        ImageView imageView;
        public EthiopiaHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.ethiopia_item);
        }
    }
}
