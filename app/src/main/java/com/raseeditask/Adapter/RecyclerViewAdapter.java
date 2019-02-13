package com.raseeditask.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.raseeditask.Model.Ads;
import com.raseeditask.MvpPackage.RecyclerItemClickListner;
import com.raseeditask.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {
    List<Ads> adsList;
    RecyclerItemClickListner recyclerItemClickListner;
    public RecyclerViewAdapter(List<Ads> adsList,RecyclerItemClickListner recyclerItemClickListner){
        this.adsList = adsList;
        this.recyclerItemClickListner=recyclerItemClickListner;
    }
    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ads_list_item,parent,false);
        myViewHolder holder = new myViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        final Ads ads = adsList.get(position);
        holder.titleTv.setText(ads.getTitle());

       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               recyclerItemClickListner.onItemClick(ads);
           }
       });
    }

    @Override
    public int getItemCount() {
        return adsList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView titleTv;
        public myViewHolder(View itemView) {
            super(itemView);
            titleTv= itemView.findViewById(R.id.textTitle);

        }
    }

}
