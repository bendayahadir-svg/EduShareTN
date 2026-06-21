package com.edushare.models;

import java.util.ArrayList;

public class Marketplace {

    private ArrayList<Ressource> ressources = new ArrayList<>();

    public void ajouterRessource(Ressource r) {
        ressources.add(r);
    }

    public void afficherRessources() {
        for (Ressource r : ressources) {
            System.out.println(r);
        }
    }

    public void rechercherRessource(String motCle) {
        for (Ressource r : ressources) {
            if (r.getTitre().contains(motCle)) {
                System.out.println(r);
            }
        }
    }
}
