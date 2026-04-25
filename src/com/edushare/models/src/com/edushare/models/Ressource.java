package com.edushare.models;

public class Ressource {

    private String titre;
    private String type;

    public Ressource(String titre, String type) {
        this.titre = titre;
        this.type = type;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return titre + " (" + type + ")";
    }
}
