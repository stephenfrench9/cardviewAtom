package com.example.stephenfrench.cardviewatom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private List<Integer> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1. I will have a scrolly thing
        setContentView(R.layout.activity_main);

        //2. It will be a list
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //3. initialize the data
        data = new ArrayList<Integer>(Arrays.asList(1,2,3,4,38,5));

        //4. put the data into the list
        mAdapter = new adapterR(data);
        mRecyclerView.setAdapter(mAdapter);

        //the adapter must:
        //1) get a reference to the recycler view - actually no - I link the adapter and the reycler view in main.
        //2) say what each item/view will look like
        //3) say how many of these views to make // this is done automatically - but how?
        //4) put the data into the views
        //5) the recycler view and layout manager will arrange the views/display them as needed

    }
}
