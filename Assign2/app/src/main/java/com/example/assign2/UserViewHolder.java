package com.example.assign2;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


public class UserViewHolder extends RecyclerView.ViewHolder {
    public TextView tvName, tvId, tvpassword;

    public UserViewHolder(View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tvName);
        tvId = itemView.findViewById(R.id.tvId);
        tvpassword = itemView.findViewById(R.id.tvpassword);


    }
}
