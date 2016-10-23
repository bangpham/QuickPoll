package com.example.hungdo.quickpoll;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Bang on 10/22/16.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    CardView cardView;
    TextView textview;
    TextView textview2;
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        textview = (TextView) itemView.findViewById(R.id.list_title);
        textview2 = (TextView) itemView.findViewById(R.id.list_desc);
        imageView = (ImageView) itemView.findViewById(R.id.list_avatar);

    }
}
