package com.example.assign2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class userAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private LayoutInflater mInflater;
    private List<user> mData = new ArrayList<>();

    public userAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mData.addAll(userRepository.getInstance().geta());

    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.a_vh, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        List<user> animals = userRepository.getInstance().geta();

        holder.tvName.setText(animals.get(position).name);
        holder.tvpassword.setText(animals.get(position).password);
        holder.tvId.setText(String.valueOf(animals.get(position).Id));
    }

    @Override
    public int getItemCount() {
        return userRepository.getInstance().geta().size();
    }

    public void update() {
        mData.clear();
        mData.addAll(userRepository.getInstance().geta());
        notifyDataSetChanged();
    }
}


