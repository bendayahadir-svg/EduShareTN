package src.com.edushare.models;

public class Reponse {
    // ==============================
    // ETAPE 1 — CHAMPS PRIVES
    // ==============================
    private int id;
    private String contenu;
    private Utilisateur auteur;
    private int votes;

    // ==============================
    // ETAPE 2 — CONSTRUCTEUR VIDE
    // ==============================
    public Reponse() {
        // vide pour l'instant
    }

    // ==============================
    // ETAPE 3 — CONSTRUCTEUR COMPLET
    // ==============================
    public Reponse(String contenu, Utilisateur auteur) {
        // vide pour l'instant
    }

    // ==============================
    // ETAPE 4 — METHODES METIER
    // ==============================

    public void ajouterVote() {
        // TODO : à remplir étape 2
    }

    public void afficherDetails() {
        // TODO : à remplir étape 2
    }

    // ==============================
    // ETAPE 5 — GETTERS / SETTERS
    // ==============================
    public int getId()                   { return id; }
    public String getContenu()           { return contenu; }
    public void setContenu(String c)     { this.contenu = c; }
    public Utilisateur getAuteur()       { return auteur; }
    public int getVotes()                { return votes; }

    // ==============================
    // ETAPE 6 — TOSTRING
    // ==============================
    @Override
    public String toString() {
        return "Reponse{id=" + id + ", votes=" + votes + "}";
    }
}
