package com.example.harsh.rblbankapp.BudgetTracker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Movie;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.harsh.rblbankapp.R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;

import java.util.ArrayList;
import java.util.List;


public class BudgetRecentFragment extends Fragment {

    private List<Transaction> transactionsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecentTransactionAdapter mAdapter;


    public BudgetRecentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v9 = inflater.inflate(R.layout.fragment_budget_recent, container, false);

        GraphView line_graph = (GraphView)v9.findViewById(R.id.graph);
        LineGraphSeries<DataPoint> line_series = new LineGraphSeries<DataPoint>(new DataPoint[]
                {
                        new DataPoint(0, 1),
                        new DataPoint(1, 5),
                        new DataPoint(2, 3),
                        new DataPoint(3, 2),
                        new DataPoint(4, 6)
                });
        line_graph.addSeries(line_series);
        line_series.setDrawDataPoints(true);
        line_series.setDataPointsRadius(10);// set the radius of data point<br />

        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(line_graph);
        staticLabelsFormatter.setHorizontalLabels(new String[]{"Jan","Feb", "March","ihd","iuwe","adad","sfs","sff"});
        staticLabelsFormatter.setVerticalLabels(new String[] {"Sun", "Mon", "Tue","jun","jul","dfg","hfh","bdh"});
        line_graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

        line_series.setOnDataPointTapListener(new OnDataPointTapListener() {

            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(getContext(), "Series: On Data Point clicked:" + dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        line_graph.getGridLabelRenderer().setTextSize(15f);
        line_graph.getGridLabelRenderer().setHorizontalLabelsColor(Color.WHITE);
        line_graph.getGridLabelRenderer().setVerticalLabelsColor(Color.WHITE);
        line_graph.getGridLabelRenderer().reloadStyles();


        recyclerView = (RecyclerView) v9.findViewById(R.id.recycler_view);

        mAdapter = new RecentTransactionAdapter(transactionsList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Transaction transaction = transactionsList.get(position);
                Toast.makeText(getContext(), transaction.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareMovieData();

        return v9;
    }

    private void prepareMovieData() {
        Transaction transaction = new Transaction("Mad Max: Fury Road", "Action & Adventure", "2015");
        transactionsList.add(transaction);

        transaction = new Transaction("Inside Out", "Animation, Kids & Family", "2015");
        transactionsList.add(transaction);

        transaction = new Transaction("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        transactionsList.add(transaction);

        transaction = new Transaction("Shaun the Sheep", "Animation", "2015");
        transactionsList.add(transaction);

        transaction = new Transaction("The Martian", "Science Fiction & Fantasy", "2015");
        transactionsList.add(transaction);

        transaction = new Transaction("Mission: Impossible Rogue Nation", "Action", "2015");
        transactionsList.add(transaction);

        transaction = new Transaction("Up", "Animation", "2009");
        transactionsList.add(transaction);

        transaction = new Transaction("Star Trek", "Science Fiction", "2009");
        transactionsList.add(transaction);

        transaction = new Transaction("The LEGO Movie", "Animation", "2014");
        transactionsList.add(transaction);

        transaction = new Transaction("Iron Man", "Action & Adventure", "2008");
        transactionsList.add(transaction);

        transaction = new Transaction("Aliens", "Science Fiction", "1986");
        transactionsList.add(transaction);

        transaction = new Transaction("Chicken Run", "Animation", "2000");
        transactionsList.add(transaction);

        transaction = new Transaction("Back to the Future", "Science Fiction", "1985");
        transactionsList.add(transaction);

        transaction = new Transaction("Raiders of the Lost Ark", "Action & Adventure", "1981");
        transactionsList.add(transaction);

        transaction = new Transaction("Goldfinger", "Action & Adventure", "1965");
        transactionsList.add(transaction);

        transaction = new Transaction("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        transactionsList.add(transaction);

        mAdapter.notifyDataSetChanged();
    }
}