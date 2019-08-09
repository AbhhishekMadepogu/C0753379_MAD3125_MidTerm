package com.abhishek.c0753379_mad3125_midterm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.DataViewHolder> {
    private Context context;

​
    private List<Satellite> satelliteList;

    public HomeAdapter(Context context, List<Satellite> satelliteList) {
        this.context = context;
        this.satelliteList = satelliteList;
    }​

​
    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homecell, parent, false);
        DataViewHolder holder = new DataViewHolder(view);
        return holder;
    }
​
    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.title.setText(satelliteList.get(position).title);
        holder.launchYear.setText(satelliteList.get(position).launchYear);
        Picasso.get().load(satelliteList.get(position).getImageUrl()).into(holder.imageView);
    }
​
    @Override
    public int getItemCount() {
        return satelliteList.size();
    }
​
        ​
    class DataViewHolder extends RecyclerView.ViewHolder {
​
        TextView title, launchYear;
        ImageView imageView;
​
        public DataViewHolder(View itemView) {
            super(itemView);
​
            title = itemView.findViewById(R.id.tvname);
            launchYear = itemView.findViewById(R.id.tvyear);
            imageView = itemView.findViewById(R.id.imgrocket);
        }
    }
}
