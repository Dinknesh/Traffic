package com.example.amanda.traffic.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Parcourt implements Serializable {
    int id;
    String distance;
    String latitude;
    String longitude;

/*    public Parcourt() {
    }

    public Parcourt(int id, String distance, String latitude, String longitude) {
        this.id = id;
        this.distance = distance;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public String getDistance() {
        return distance;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public static ArrayList<Parcourt> from fakedata(){

        ArrayList<Parcourt> results = new ArrayList<>();

        Parcourt parcourt = new Parcourt();
        parcourt.setDistance("15km");
        parcourt.setLatitude("");
        parcourt.setLongitude("");



        return results;
    }*/
}
