import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Liste des signalements
        List<Signalement> signalements = new ArrayList<>();

        // Création de signalements
        Signalement s1 = new Signalement(1, "Document faux", "Information incorrecte", "Etudiant1");
        Signalement s2 = new Signalement(2, "Réponse incorrecte", "Spam", "Etudiant2");

        signalements.add(s1);
        signalements.add(s2);

        // Création admin
        Admin admin = new Admin("Admin1");

        // Afficher signalements
        admin.voirSignalements(signalements);

        // Supprimer contenu
        admin.supprimerContenu(s1);

        // Afficher après suppression
        admin.voirSignalements(signalements);
    }
}