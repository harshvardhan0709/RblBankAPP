package com.example.harsh.rblbankapp.BudgetTracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.harsh.rblbankapp.R;

import java.util.List;

/**
 * Created by harsh on 23/6/17.
 */

public class RecentTransactionAdapter extends RecyclerView.Adapter<RecentTransactionAdapter.MyViewHolder> {

    private List<Transaction> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public RecentTransactionAdapter(List<Transaction> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Transaction transaction = moviesList.get(position);
        holder.title.setText(transaction.getTitle());
        holder.genre.setText(transaction.getGenre());
        holder.year.setText(transaction.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
