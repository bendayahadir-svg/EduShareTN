/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edusharetn;
import java.util.ArrayList;

public class EduShareTN {
    public static void main(String[] args) {

        ArrayList<String> emails = new ArrayList<>();

        String nom      = "ali";
        String email    = "ali@gmail.com";
        String password = "1234";
        int points      = 0;

        if (emails.contains(email)) {
            System.out.println("Email déjà utilisé !");
        } else {
            emails.add(email);
            System.out.println("=== Création Profil ===");
            System.out.println("Nom : "    + nom);
            System.out.println("Email : "  + email);
            System.out.println("Mot de passe enregistré");
            System.out.println("Points : " + points);
            System.out.println("Compte créé avec succès !");
        }
    }
}
