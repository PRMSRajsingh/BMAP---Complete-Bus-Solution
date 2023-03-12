package com.finalproject.bmap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<model_stops,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<model_stops> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model_stops model) {
        holder.busno.setText(model.getBusNo());
        holder.time.setText(model.getTime());
        holder.type.setText(model.getType());
        Glide.with(holder.img1.getContext()).load(model.getPurl()).into(holder.img1);

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign, parent, false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {

        ImageView img1;
        TextView busno, time, type;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img1 = itemView.findViewById(R.id.img1);
            busno = itemView.findViewById(R.id.busno);
            time = itemView.findViewById(R.id.time);
            type = itemView.findViewById(R.id.type);
        }
    }

}
