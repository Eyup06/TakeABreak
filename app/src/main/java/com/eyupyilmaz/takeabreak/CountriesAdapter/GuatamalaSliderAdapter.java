package com.eyupyilmaz.takeabreak.CountriesAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.eyupyilmaz.takeabreak.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class GuatamalaSliderAdapter extends SliderViewAdapter<GuatamalaSliderAdapter.GuatemalaHolder> {

    int[] GuatemalaImage;

    public GuatamalaSliderAdapter(int[] guatemalaImage) {
        GuatemalaImage = guatemalaImage;
    }

    @Override
    public GuatemalaHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.guatemala_slider_item,parent,false);
        return new GuatemalaHolder(view);
    }

    @Override
    public void onBindViewHolder(GuatemalaHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(GuatemalaImage[position]);
    }

    @Override
    public int getCount() {
        return GuatemalaImage.length;
    }

    public class GuatemalaHolder extends ViewHolder {

        ImageView imageView;
        public GuatemalaHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.guatemala_item);
        }
    }
}
