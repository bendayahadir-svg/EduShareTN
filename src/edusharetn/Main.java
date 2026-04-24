import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.println("========== CONFIGURATION DU SPRINT 1 (SAISIE) ==========");
        
        // --- SAISIE MEMBRE 1 ---
        System.out.print("Nom de l'étudiant  : ");
        String nomM1 = sc.nextLine();
        
        // --- SAISIE MEMBRE 3 (VOUS) ---
        System.out.print("Titre de la question au forum  : ");
        String titreQ = sc.nextLine();
        
        // --- SAISIE MEMBRE 2 ---
        System.out.print("Nom du document à partager  : ");
        String docM2 = sc.nextLine();

        System.out.println("\n--- Génération du rapport en cours... ---\n");

        // --- INSTANCIATION DES OBJETS ---
        Utilisateur user1 = new Utilisateur(1, nomM1, nomM1.toLowerCase().replace(" ", "") + "@fsegt.utm.tn");
        Utilisateur sarah = new Utilisateur(2, "Sarah Mansour", "sarah@mail.com");
        
        Question q1 = new Question(titreQ, "Détails de la question...", user1);
        Reponse r1 = new Reponse("Voici ma proposition de solution.", sarah);
        
        // --- LOGIQUE MÉTIER ---
        q1.ajouterReponse(r1);
        r1.ajouterVote(); 
        sarah.ajouterPoints(10); 

        // --- AFFICHAGE FINAL (Format Prototype Projet) ---
        System.out.println("=== EDUSHARE TN — Sprint 1 ===");

        System.out.println("--- Authentification (Membre 1) ---");
        System.out.println("Utilisateur créé : " + user1.getNom() + " (" + user1.getEmail() + ")");
        System.out.println("Connexion réussie !");
        System.out.println();

        System.out.println("--- Partage de Documents (Membre 2) ---");
        System.out.println("Document uploadé : '" + docM2 + "' (Matière: Informatique)");
        System.out.println("Recherche par mot-clé : 1 document trouvé.");
        System.out.println();

        System.out.println("--- Forum d'Entraide (Membre 3) ---");
        System.out.println("Question publiée : " + q1.getTitre());
        System.out.println("Réponse ajoutée par Sarah Mansour");
        System.out.println("Statut : " + r1.getVotes() + " vote reçu.");
        System.out.println();

        System.out.println("--- Marketplace (Membre 4) ---");
        System.out.println("Annonce publiée : 'Calculatrice TI-84', Prix : 150 DT");
        System.out.println("Statut : Disponible");
        System.out.println();

        System.out.println("--- Admin (Membre 5) ---");
        System.out.println("Nombre d'utilisateurs : 2");

        System.out.println("\n===========================================");
        sc.close();
    }
}