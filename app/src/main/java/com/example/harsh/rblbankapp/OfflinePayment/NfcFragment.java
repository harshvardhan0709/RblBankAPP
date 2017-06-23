package com.example.harsh.rblbankapp.OfflinePayment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.harsh.rblbankapp.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class NfcFragment extends Fragment {


    private LineChart lineChart;

    public NfcFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v5 = inflater.inflate(R.layout.fragment_nfc, container, false);

        //lineChart = (LineChart)v5.findViewById(R.id.pie_chart);

        //float yValues [] = {10, 20, 30, 0, 40, 60};
        //String xValues [] = {"ABC","XYZ","ASD","SDF","DFG","sdfsd"};

        //drawLineChart(yValues,xValues);

        return v5;
    }

    private void drawLineChart(float yValues[], String[] xValues)
    {

        //lineChart.setDescription("Linear Graph");
        ArrayList<Entry> yData = new ArrayList<>();
        for (int i = 0;i < yValues.length;i++)
        {
            yData.add(new Entry(yValues[i],i));
        }

        ArrayList<String> xData = new ArrayList<>();
        for (int i =0;i < xValues.length;i++)
        {
            xData.add(xValues[i]);
        }

        LineDataSet lineDataSet = new LineDataSet(yData, "Linear Graph");
        lineDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        LineData lineData = new LineData(lineDataSet);
        lineData.setValueTextSize(13f);
        lineData.setValueTextColor(Color.BLACK);

        lineChart.setData(lineData);
        lineChart.invalidate();
    }
}
