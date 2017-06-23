package com.example.harsh.rblbankapp.BudgetTracker;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;

import java.util.ArrayList;

import com.example.harsh.rblbankapp.R;

public class budgettranListFragment extends Fragment {

    private SwipeMenuListView mListView;

    private ArrayList<String> mArrayList=new ArrayList<>();
    private ListDataAdapter mListDataAdapter;
    View v8;

    public budgettranListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         v8 = inflater.inflate(R.layout.fragment_budgettran_list, container, false);

        initControls();
        return v8;
    }

    private void initControls() {

        mListView=(SwipeMenuListView)v8.findViewById(R.id.listView);

        mListView.setSwipeDirection(SwipeMenuListView.DIRECTION_LEFT);

        for (int i=0;i<5;i++){

            mArrayList.add("List item --> "+i);

        }

// mListView.setCloseInterpolator(new BounceInterpolator());

        mListDataAdapter=new ListDataAdapter();

        mListView.setAdapter(mListDataAdapter);

        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override

            public void create(SwipeMenu menu) {

// Create different menus depending on the view type

                SwipeMenuItem goodItem = new SwipeMenuItem(

                        getContext());


// create "delete" item

                SwipeMenuItem deleteItem = new SwipeMenuItem(

                        getContext());

// set item background

                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,

                        0x3F, 0x25)));

// set item width

                deleteItem.setWidth(dp2px(90));

// set a icon

                deleteItem.setIcon(R.drawable.iconstrash);

// add to menu

                menu.addMenuItem(deleteItem);

            }

        };

// set creator

        mListView.setMenuCreator(creator);

        mListView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {

            @Override

            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {

                switch (index) {

                    case 0:

                        Toast.makeText(getContext(),"Like button press",Toast.LENGTH_SHORT).show();

                        break;

                    case 1:

                        mArrayList.remove(position);

                        mListDataAdapter.notifyDataSetChanged();

                        Toast.makeText(getContext(),"Item deleted",Toast.LENGTH_SHORT).show();

                        break;

                }

                return true;

            }

        });

//mListView

        mListView.setOnMenuStateChangeListener(new SwipeMenuListView.OnMenuStateChangeListener() {

            @Override

            public void onMenuOpen(int position) {

            }

            @Override

            public void onMenuClose(int position) {

            }

        });

        mListView.setOnSwipeListener(new SwipeMenuListView.OnSwipeListener() {

            @Override

            public void onSwipeStart(int position) {

            }

            @Override

            public void onSwipeEnd(int position) {

            }

        });

    }



    class ListDataAdapter extends BaseAdapter {

        ViewHolder holder;

        @Override

        public int getCount() {

            return mArrayList.size();

        }

        @Override

        public Object getItem(int i) {

            return null;

        }

        @Override

        public long getItemId(int i) {

            return 0;

        }

        @Override

        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView==null){

                holder=new ViewHolder();

                convertView=getActivity().getLayoutInflater().inflate(R.layout.transation_item,null);

                holder.mTextview=(TextView)convertView.findViewById(R.id.types);

                convertView.setTag(holder);

            }else {

                holder= (ViewHolder) convertView.getTag();

            }

            holder.mTextview.setText(mArrayList.get(position));

            return convertView;

        }

        class ViewHolder {

            TextView mTextview;

        }

    }

    private int dp2px(int dp) {

        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,

                getResources().getDisplayMetrics());

    }

}

