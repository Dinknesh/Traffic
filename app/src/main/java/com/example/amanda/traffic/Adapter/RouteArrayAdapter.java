package com.example.amanda.traffic.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import com.example.amanda.traffic.Models.Alerte;

public class RouteArrayAdapter extends ArrayAdapter<Alerte> {
    public RouteArrayAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
