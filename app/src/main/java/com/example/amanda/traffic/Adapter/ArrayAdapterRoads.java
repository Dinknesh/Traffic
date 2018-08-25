package com.example.amanda.traffic.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amanda.traffic.Models.Roads;
import com.example.amanda.traffic.R;

import java.util.ArrayList;

public class ArrayAdapterRoads extends ArrayAdapter<Roads> {
    public ArrayAdapterRoads(Context context, ArrayList<Roads> service) {
        super(context, android.R.layout.simple_list_item_1, service);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get the data item for position
        Roads service = getItem(position);

        // check the existing view being reused
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.roads_list_item, parent, false);
        }

        TextView text = (TextView) convertView.findViewById(R.id.tvStep);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivRoads);


        text.setText(service.getTitle());
        imageView.setImageResource(service.getImageView());

        return convertView;
    }
}
