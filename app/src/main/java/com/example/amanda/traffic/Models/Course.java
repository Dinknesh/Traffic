package com.example.amanda.traffic.Models;

public class Course {

    String depart;
    String arrivee;
    double prix;
    double distance;

    public Course(String depart, String arrivee, double prix, double distance) {
        this.depart = depart;
        this.arrivee = arrivee;
        this.prix = prix;
        this.distance = distance;
    }

    public Course() {
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getDepart() {
        return depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public double getPrix() {
        return prix;
    }

    public double getDistance() {
        return distance;
    }
}
