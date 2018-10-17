package com.example.stephenfrench.cardviewatom;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class adapterR extends RecyclerView.Adapter<adapterR.basket> {

    String[] data;

    public class basket extends RecyclerView.ViewHolder {
        public TextView one;
        public TextView two;
        public basket(@NonNull View itemView) {
            super(itemView);
            Log.d("earth", "basket(): begin");
            one = itemView.findViewById(R.id.tv1);
            two = itemView.findViewById(R.id.tv2);
            Log.d("earth", "basket(): end");
        }
    }

    public adapterR(String[] l) {
        Log.d("earth", "adapterR(): adapter building");
        data = l;
        Log.d("earth", "adapterR(): adapter built");
    }

    @NonNull
    @Override
    public adapterR.basket onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.d("earth", "onCreateViewHolder(): Begin iteration " + i);
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        Log.d("earth", "onCreateViewHolder(): middle iteration " + i);
        inflater.inflate(R.layout.viewt, viewGroup, false);
        Log.d("earth", "onCreateViewHolder(): late middle iteration " + i);
        adapterR.basket b = new basket(inflater.inflate(R.layout.viewt, viewGroup, false));
        Log.d("earth", "onCreateViewHolder(): finished iteration " + i);
        return b;
    }

    @Override
    public void onBindViewHolder(@NonNull basket basket, int i) {
        Log.d("earth", "onBindViewHolder: begin iteration: " + i);
        basket.one.setText(data[i]);
        basket.two.setText(data[i]);
        Log.d("earth", "onBindViewHolder: end iteration: " + i);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

}
