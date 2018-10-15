package com.example.stephenfrench.cardviewatom;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.ViewGroup;

import java.util.List;

public class adapterR<E> extends Adapter {

    List<E> data;

    public adapterR(List<E> l) {
        data = l;
        // this is 100% right - the constructor for the adapter just stores the data you want to eventually display. 
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        layout = viewGroup.addView(inflate(R.layout.viewt)); //the view group is really just the recycler view, and it knows how many things it has displayed.
        return layout;

        //make a view (designate which layout to choose)
        //wrap that view in a view holder
        //the view holder constructor just does the wrapping process, storeing away some nice references for later.

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.info_text.setText("we are displaying the " + i + "th thing in the recyclerview");
        viewHolder.data_text.setText("The data is: " + data.get(i));

        //this is where we actulaly go modify those views, and put the data that is stored in the adapter into the views.
    }

    @Override
    public int getItemCount() {
        int i = data.size();
        return 0;
    }

    public class RecyclerView.View
}
