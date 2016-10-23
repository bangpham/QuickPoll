package com.example.hungdo.quickpoll;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import model.Facade;

import static com.example.hungdo.quickpoll.R.id.card_view;

/**
 * Created by Bang on 10/22/16.
 */

public class ProfileRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    //TextView title = (TextView) findViewById(R.id.list_title);
    Facade facade = Facade.getFacade();
    List<Question> myListQuestion = facade.getListQuestionByID(Facade.getUser().getID());

    Context context;
    LayoutInflater inflater;

    public ProfileRecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textview.setText(myListQuestion.get(position).getQuestion());
        holder.textview2.setText(myListQuestion.get(position).getTotal() + " votes");
        holder.cardView.setOnClickListener(clickListener);
        holder.cardView.setTag(holder);
        holder.imageView.setImageResource(R.drawable.user);
    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            RecyclerViewHolder vholder = (RecyclerViewHolder) view.getTag();
            int position = vholder.getLayoutPosition();
            System.out.println(position);
            facade.setQuestionInfo(myListQuestion.get(position));
            facade.profileQuestion = true;
            context.startActivity(new Intent(context, QuestionActivity.class));
        }
    };


    @Override
    public int getItemCount() {
        return myListQuestion.size();
    }
}