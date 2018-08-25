package com.example.amanda.traffic.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.amanda.traffic.Models.Step;
import com.example.amanda.traffic.R;

import java.util.ArrayList;

public class ArrayAdapterStep extends ArrayAdapter<Step> {
    public ArrayAdapterStep(Context context, ArrayList<Step> service) {
        super(context, android.R.layout.simple_list_item_1, service);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get the data item for position
        Step service = getItem(position);

        // check the existing view being reused
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.step_list_item, parent, false);
        }

        TextView text = (TextView) convertView.findViewById(R.id.tvDep);
        TextView text1 = (TextView) convertView.findViewById(R.id.tvEnd);
        TextView text2 = (TextView) convertView.findViewById(R.id.tvPrix);

        text.setText(service.getTitle());
        text1.setText(service.getTitle1());
        text2.setText(service.getTitle3());


        return convertView;
    }
}
