import java.util.List;
import java.util.ArrayList; 

public class Ques{
    private String titre;
    private String contenu;
    private Utilisateur auteur;
    private List<Reponse> reponses;
    
    public Quest(String titre, String contenu, Utilisateur auteur,List<Reponse> reponses){
        this.titre = titre;
        this.contenu = contenu;
        this.auteur = auteur;
        this.reponses = reponses ;
    }

    public void poserQuestion(){
        System.out.println("Question posée par"+ auteur);
        System.out.println("Titre : "+ titre);
        System.out.println("Contenu : "+ contenu);
    }

    public void ajouterReponse(Reponse r)
    {
        reponses.add(r);
    }

    public void afficherQuestion(){
        System.out.println("Questions posées:  " + titre);
        System.out.println(contenu);
    }

}