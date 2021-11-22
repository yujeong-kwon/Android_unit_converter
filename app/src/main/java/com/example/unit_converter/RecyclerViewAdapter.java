package com.example.unit_converter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private ArrayList<String> mUnitList;

    public RecyclerViewAdapter(ArrayList<String> unit_list){
        mUnitList = unit_list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.unit_item,parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        String strUnit = mUnitList.get(position);
        holder.unit.setText(strUnit);

    }

    @Override
    public int getItemCount() {
        return mUnitList.size();
    }
}
