package com.example.unit_converter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView unit;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        unit = itemView.findViewById(R.id.unit);
    }
}
