package com.example.amanda.traffic.Models;

import com.example.amanda.traffic.R;

import java.io.Serializable;
import java.util.ArrayList;

public class Roads implements Serializable {
    String title;
    int imageView;

    public Roads(String title, int imageView) {
        this.title = title;
        this.imageView = imageView;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTitle() {
        return title;
    }

    public int getImageView() {
        return imageView;
    }

    public Roads() {
    }


    public static ArrayList<Roads> fromFakeData() {
        ArrayList<Roads> results = new ArrayList<>();

        Roads roads = new Roads();
        roads.setTitle("Route 1");
        roads.setImageView(R.drawable.ic_roads);

        Roads roads1 = new Roads();
        roads1.setTitle("Route 1");
        roads1.setImageView(R.drawable.ic_roads);

        Roads roads2 = new Roads();
        roads2.setTitle("Route 2");
        roads2.setImageView(R.drawable.ic_roads);

        Roads roads3 = new Roads();
        roads3.setTitle("Route 3");
        roads3.setImageView(R.drawable.ic_roads);


        results.add(roads);
        results.add(roads1);
        results.add(roads2);
        results.add(roads3);
        return results;
    }
}
