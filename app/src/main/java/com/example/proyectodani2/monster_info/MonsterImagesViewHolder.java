package com.example.proyectodani2.monster_info;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.proyectodani2.R;

/**
 * Created by dam2a on 01/03/18.
 */

public class MonsterImagesViewHolder extends RecyclerView.ViewHolder {
    public ImageView ivContent;

    public MonsterImagesViewHolder(View itemView) {
        super(itemView);
        ivContent = itemView.findViewById(R.id.imageMonsterPics);
    }
}