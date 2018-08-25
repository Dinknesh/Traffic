package com.example.amanda.traffic.Models;

public class Alerte {
    double heure;
    double date;
    String endroit;
    double idType;

    public Alerte(double heure, double date, String endroit, double idType) {
        this.heure = heure;
        this.date = date;
        this.endroit = endroit;
        this.idType = idType;
    }

    public double getHeure() {
        return heure;
    }

    public double getDate() {
        return date;
    }

    public String getEndroit() {
        return endroit;
    }

    public double getIdType() {
        return idType;
    }

    public void setHeure(double heure) {
        this.heure = heure;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public void setEndroit(String endroit) {
        this.endroit = endroit;
    }

    public void setIdType(double idType) {
        this.idType = idType;
    }
}
