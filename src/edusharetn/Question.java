import java.util.ArrayList;
import java.util.List;

public class Question {

    // ==============================
    // ETAPE 1 — CHAMPS PRIVES
    // ==============================
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
        this.titre    = titre;
        this.contenu  = contenu;
        this.auteur   = auteur;
        this.reponses = new ArrayList<>();
    }

    // ==============================
    // ETAPE 4 — METHODES METIER
    // ==============================

    public void poserQuestion() {
        System.out.println("Question posee : " + titre);
        System.out.println("Par : " + auteur);
    }

    public void ajouterReponse(Reponse r) {
        reponses.add(r);
        System.out.println("Reponse ajoutee !");
    }

    public Reponse getMeilleureReponse() {
        if (reponses.isEmpty()) 
            return null;
        Reponse meilleure = reponses.get(0);
        for (Reponse r : reponses) {
            if (r.getVotes() > meilleure.getVotes()) {
                meilleure = r;
            }
        }
        return meilleure;
    }

    public void afficherDetails() {
        System.out.println("=== Question : " + titre + " ===");
        System.out.println("Auteur  : " + auteur);
        System.out.println("Reponses: " + reponses.size());
    }

    // ==============================
    // ETAPE 5 — GETTERS / SETTERS
    // ==============================
    public String getTitre(){               
        return titre; 
    }
    public void setTitre(String titre){     
        this.titre = titre; 
    }
    public String getContenu(){             
        return contenu; 
    }
    public void setContenu(String contenu){ 
        this.contenu = contenu; 
    }
    public Utilisateur getAuteur(){         
        return auteur; 
    }
    public List<Reponse> getReponses(){     
        return reponses; 
    }

    // ==============================
    // ETAPE 6 — TOSTRING
    // ==============================
    @Override
    public String toString() {
        return "Question (titre=" + titre + ")";
    }
}