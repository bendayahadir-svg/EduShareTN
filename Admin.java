import java.util.List;

public class Admin {

    String nom;

    // Constructeur
    public Admin(String nom) {
        this.nom = nom;
    }

    // Voir les signalements
    public void voirSignalements(List<Signalement> liste) {
        System.out.println("=== Liste des signalements ===");
        for (Signalement s : liste) {
            System.out.println(s);
        }
    }

    // Supprimer contenu (simulation)
    public void supprimerContenu(Signalement s) {
        if (s.statut.equals("EN_ATTENTE")) {
            s.statut = "TRAITE";
            System.out.println("Contenu supprimé par admin : " + nom);
        } else {
            System.out.println("Déjà traité !");
        }
    }
}
