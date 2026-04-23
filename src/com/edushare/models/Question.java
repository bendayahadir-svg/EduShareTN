package src.com.edushare.models;

import java.util.List;

public class Question {
   // ==============================
    // ETAPE 1 — CHAMPS PRIVES
    // ==============================
    private int id;
    private String titre;
    private String contenu;
    private Utilisateur auteur;
    private List<Reponse> reponses;

    // ==============================
    // ETAPE 2 — CONSTRUCTEUR VIDE
    // ==============================
    public Question() {
        // vide pour l'instant
    }

    // ==============================
    // ETAPE 3 — CONSTRUCTEUR COMPLET
    // ==============================
    public Question(String titre, String contenu, Utilisateur auteur) {
        // vide pour l'instant
    }

    // ==============================
    // ETAPE 4 — METHODES METIER
    // ==============================

    public void poserQuestion() {
        // TODO : à remplir étape 2
    }

    public void ajouterReponse(Reponse r) {
        // TODO : à remplir étape 2
    }

    public Reponse getMeilleureReponse() {
        // TODO : à remplir étape 2
        return null;
    }

    public void afficherDetails() {
        // TODO : à remplir étape 2
    }

    // ==============================
    // ETAPE 5 — GETTERS / SETTERS
    // ==============================
    public int getId()                     { return id; }
    public String getTitre()               { return titre; }
    public void setTitre(String titre)     { this.titre = titre; }
    public String getContenu()             { return contenu; }
    public void setContenu(String contenu) { this.contenu = contenu; }
    public Utilisateur getAuteur()         { return auteur; }
    public List<Reponse> getReponses()     { return reponses; }

    // ==============================
    // ETAPE 6 — TOSTRING
    // ==============================
    @Override
    public String toString() {
        return "Question{id=" + id + ", titre=" + titre + "}"; 
}
