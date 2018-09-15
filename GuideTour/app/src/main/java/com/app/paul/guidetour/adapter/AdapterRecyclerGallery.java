package com.app.paul.guidetour.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.app.paul.guidetour.R;

import java.util.List;

/**
 * Adapter to display images int ActivityShowDetail
 */
public class AdapterRecyclerGallery extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<Integer> listImagesGallery;

    public AdapterRecyclerGallery(Context context, List<Integer> listImages) {
        listImagesGallery = listImages;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_image_gallery, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).myImage.setImageResource(listImagesGallery.get(position));
    }

    @Override
    public int getItemCount() {
        return listImagesGallery.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {
        ImageView myImage;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            myImage = itemView.findViewById(R.id.item_gallery_image);
        }
    }
}
