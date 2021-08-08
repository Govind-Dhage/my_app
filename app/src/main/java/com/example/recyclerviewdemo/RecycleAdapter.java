package com.example.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ImageViewHolder> {
private int [] images;
public RecycleAdapter(int[]images){
    this.images=images;
}
    @Override
    public ImageViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_layout,parent,false);
        ImageViewHolder imageViewHolder=new ImageViewHolder(view);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder( ImageViewHolder holder, int position) {
        int imge_id= images[position];
        holder.Album.setImageResource(imge_id);
        holder.AlbumTitle.setText("Image :"+position);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }
    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView Album;
        TextView AlbumTitle;

        public ImageViewHolder( View itemView) {
            super(itemView);
            Album=itemView.findViewById(R.id.computer);
            AlbumTitle=itemView.findViewById(R.id.tvcomputer);

        }
    }
}
