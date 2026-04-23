public class Reponse{
    private String contenu;
    private Utilisateur auteur;
    private int votes;

    public String getContenu(){
        return contenu;
    }

    public Utilisateur getAuteur(){
        return auteur;
    }

    public Reponse(String contenu, Utilisateur auteur){
        this.contenu = contenu;
        this.auteur= auteur;
        this.votes = 0;
    }

    public void ajouterVote(){
        votes++;
    }

    public int getVotes(){
        return votes;
    }

    public void afficherReponce(){
        System.out.println("Réponce : " + contenu);
        System.out.println("Votes : " + votes);
    }

}