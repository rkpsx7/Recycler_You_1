package com.example.recycler_you_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class articleAdapter extends RecyclerView.Adapter<articleViewHolder> {

private ArrayList<ArticleModel> adapterList;
    public articleAdapter(ArrayList<ArticleModel> adapterListC) {
        adapterList = adapterListC;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public articleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new articleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull articleViewHolder holder, int position) {
        ArticleModel articleModel = adapterList.get(position);
        holder.setDataFromModel(articleModel);
    }

    @Override
    public int getItemCount() {
        if (adapterList != null)
            return adapterList.size();
        else
            return 0;
    }
}
