package com.example.harsh.rblbankapp.OfflinePayment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.harsh.rblbankapp.R;


public class UssdFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    String[] country = { "State Bank of India", "Punjab National Bank", "HDFC Bank", "ICICI Bank", "AXIS Bank", "Canara Bank","Bank Of India"
            ,"Bank of Baroda","IDBI Bank","Union Bank of India","Central Bank of India","India Overseas Bank","Oriental Bank of Commerce","Allahabad Bank"
            ,"Syndicate Bank","UCO Bank","Corporation Bank","Indian Bank","Andhra Bank","State Bank of Hyderabad","Bank of Maharashtra","State Bank of Patiala"
            ,"United Bank of India","Vijaya Bank","Dena Bank","Yes Bank"};


    String Text;

    public UssdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ussd, container, false);

        final Spinner spin = (Spinner)v.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, country);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spin.setAdapter(adapter);

        Button button = (Button)v.findViewById(R.id.btn_ussd);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                String ussd = "*99"+Text+ Uri.encode("#");
                callIntent.setData(Uri.parse("tel:" + ussd));
                startActivity(callIntent);
            }
        });


        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View arg1,
                                       int pos, long arg3) {
                Text = parent.getSelectedItem().toString();

                switch (spin.getSelectedItemPosition())
                {
                    case 0:
                        Text = "*41";
                        break;
                    case 1:
                        Text = "*42";
                        break;
                    case 2:
                        Text = "*43";
                        break;
                    case 3:
                        Text = "*44";
                        break;
                    case 4:
                        Text = "*45";
                        break;
                    case 5:
                        Text = "*46";
                        break;
                    case 6:
                        Text = "*47";
                        break;
                    case 7:
                        Text = "*48";
                        break;
                    case 8:
                        Text = "*49";
                        break;
                    case 9:
                        Text = "*50";
                        break;
                    case 10:
                        Text = "*51";
                        break;
                    case 11:
                        Text = "*52";
                        break;
                    case 12:
                        Text = "*53";
                        break;
                    case 13:
                        Text = "*54";
                        break;
                    case 14:
                        Text = "*55";
                        break;
                    case 15:
                        Text = "*56";
                        break;
                    case 16:
                        Text = "*57";
                        break;
                    case 17:
                        Text = "*58";
                        break;
                    case 18:
                        Text = "*59";
                        break;
                    case 19:
                        Text = "*60";
                        break;
                    case 20:
                        Text = "*61";
                        break;
                    case 21:
                        Text = "*62";
                        break;
                    case 22:
                        Text = "*63";
                        break;
                    case 23:
                        Text = "*64";
                        break;
                    case 24:
                        Text = "*65";
                        break;
                    case 25:
                        Text = "*66";
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return v;
    }

}
