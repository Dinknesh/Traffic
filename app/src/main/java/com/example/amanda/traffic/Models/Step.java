package com.example.amanda.traffic.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Step  implements Serializable{
    String title;
    String title1;
    String title3;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle1() {
        return title1;
    }

    public String getTitle3() {
        return title3;
    }

    public static ArrayList<Step> fromFakeData() {
        ArrayList<Step> results = new ArrayList<>();

        Step roads = new Step();
        roads.setTitle("From Portail to Delmas");
        roads.setTitle1("100m");
        roads.setTitle3("25 gourdes");

        Step roads1 = new Step();
        roads1.setTitle("From potail to Carrefour");
        roads1.setTitle1("100m");
        roads1.setTitle3("25gourdes");


        Step roads2 = new Step();
        roads2.setTitle("From potail to Gerald");
        roads2.setTitle1("100m");
        roads2.setTitle3("25gourdes");


        Step roads4 = new Step();
        roads4.setTitle("From Portail to Carrefour");
        roads4.setTitle1("100m");
        roads4.setTitle3("25 gourdes");

        Step roads3 = new Step();
        roads3.setTitle("From potail to Delmas");
        roads3.setTitle1("100m");
        roads3.setTitle3("25gourdes");

/*
        Step roads5 = new Step();
        roads5.setTitle("Route 1");
        roads5.setTitle1("Route 1");
        roads5.setTitle3("Route 1");*/

        results.add(roads);
        results.add(roads1);
        results.add(roads2);
        results.add(roads4);
        results.add(roads3);
       // results.add(roads5);

        return results;
    }

}
