package com.example.recycler_you_1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class articleViewHolder extends RecyclerView.ViewHolder {
    private ImageView MainImage;
    private TextView header;
    private TextView MainHeading;
    private TextView content;

    public articleViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        MainImage = itemView.findViewById(R.id.ivMainImage);
        header = itemView.findViewById(R.id.tvTagLine);
        MainHeading = itemView.findViewById(R.id.tvTitle);
        content = itemView.findViewById(R.id.tvContent);
    }

    public void setDataFromModel(ArticleModel model){
        MainImage.setImageResource(model.getMainImage());
        header.setText(model.getHeader());
        MainHeading.setText(model.getMainHeading());
        content.setText(model.getContent());
    }


}
