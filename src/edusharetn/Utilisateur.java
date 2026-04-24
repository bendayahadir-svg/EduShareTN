
public class Utilisateur {

    private int id;
    private String nom;
    private String email;
    private int points;

    public Utilisateur(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.points = 0;
    }

    public void seConnecter() {
        System.out.println(nom + " connecté avec succès.");
    }

    public void ajouterPoints(int p) {
        points = points + p;
    }
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public int getPoints() {
        return points;
    }

    public void afficherProfil() {
        System.out.println("===== Profil =====");
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Email : " + email);
        System.out.println("Points : " + points);
        if (points >= 100) {
            System.out.println("Niveau : Gold");
        } else if (points >= 50) {
            System.out.println("Niveau : Silver");
        } else {
            System.out.println("Niveau : Bronze");
        }
    }
}