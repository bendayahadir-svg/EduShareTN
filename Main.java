public class Main {
    public static void main(String[] args) {

        Utilisateur u1 = new Utilisateur("Ali");
        Utilisateur u2 = new Utilisateur("Sara");

        Question q = new Question(
            "Problème Java",
            "Comment utiliser ArrayList ?",
            u1
        );

        Reponse r = new Reponse(
            "Utilise new ArrayList<>()",
            u2
        );

        q.ajouterReponse(r);

        q.afficherQuestion();
        r.afficherReponse();
    }
}
