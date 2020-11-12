package com.example.bicyclefinder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;


public class BikeCaptionedImageRecyclerViewAdapter extends RecyclerView.Adapter<BikeCaptionedImageRecyclerViewAdapter.ViewHolder>{

    //private static final String LOG_TAG = "bikecaptionedimagerecyclerviewadapter";
    private String[] bikecaptions;
    private int[] imageIds;

    public BikeCaptionedImageRecyclerViewAdapter(String[] bikecaptions, int[] imageIds){
        this.bikecaptions = bikecaptions;
        this.imageIds = imageIds;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        private CardView cardView;

        public ViewHolder (CardView v){
            super(v);
            cardView = v;
        }
    }

    @NonNull
    @Override
    public BikeCaptionedImageRecyclerViewAdapter.ViewHolder onCreateViewHolder
            (@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_bike_captioned_image,parent,false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(bikecaptions[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.info_text);
        textView.setText(bikecaptions[position]);

    }

    @Override
    public int getItemCount() {
        return bikecaptions.length;
    }

}
