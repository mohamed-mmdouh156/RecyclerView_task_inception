package com.example.recyclerview_task;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Viewholder> {

    ArrayList<model> data ;
    Context context ;

    public RecyclerAdapter(ArrayList<model> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_row , parent , false);

       Viewholder holder = new Viewholder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        model item  = data.get(position);

        holder.profile_img.setImageResource(item.getUser_image());
        holder.user_name.setText(item.getUsername());
        holder.desc.setText(item.getDescription());
        holder.user_photo.setImageResource(item.getUser_photo());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        ImageView profile_img , user_photo , like , comment , favorite , share ;
        TextView user_name , desc;

        public Boolean liked = false  , stared = false;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            profile_img = itemView.findViewById(R.id.profile_image);
            user_name = itemView.findViewById(R.id.user_name_tv);
            desc = itemView.findViewById(R.id.description);
            user_photo = itemView.findViewById(R.id.row_user_photo);
            like = itemView.findViewById(R.id.row_like_icon);
            favorite = itemView.findViewById(R.id.row_star_icon);
            comment = itemView.findViewById(R.id.row_comment_icon);

            like.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceType")
                @Override
                public void onClick(View v) {

                    if (liked == false)
                    {
                        like.setImageResource(R.drawable.like);
                        liked = true ;
                    }
                    else {
                        like.setImageResource(R.drawable.heart);
                        liked = false;
                    }
                }
            });

            favorite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (stared == false)
                    {
                        favorite.setImageResource(R.drawable.star);
                        stared = true ;
                    }
                    else {
                        favorite.setImageResource(R.drawable.stared);
                        stared = false ;
                    }

                }
            });

        }
    }
}
