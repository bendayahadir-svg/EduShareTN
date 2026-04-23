public class Main{
    public static void main(String[] args){
        Utilisateur u1 = new Utilisateur("ali");
        Utilisateur u2 = new Utilisateur("Sarah");
        Quest q = new Quest ("comment faire UML?", "aidez-moi", u1);
        Reponse r1 = new Reponse("Utiliser StarUML", u2);
        r1.ajouterVote();
        r1.ajouterVote();
        q.ajouterReponse();
        q.ajouterReponse(r1);
        q.afficherQuestion();
        System.out.println("Votre Réponse : "+ r1.getVotes());
    }
}