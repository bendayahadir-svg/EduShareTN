public class Signalement {

    int id;
    String contenu;
    String raison;
    String auteur;
    String statut; // EN_ATTENTE ou TRAITE

    // Constructeur
    public Signalement(int id, String contenu, String raison, String auteur) {
        this.id = id;
        this.contenu = contenu;
        this.raison = raison;
        this.auteur = auteur;
        this.statut = "EN_ATTENTE";
    }

    // Méthode pour afficher
    @Override
    public String toString() {
        return "Signalement ID: " + id +
               "\nContenu: " + contenu +
               "\nRaison: " + raison +
               "\nAuteur: " + auteur +
               "\nStatut: " + statut +
               "\n----------------------";
    }
}
