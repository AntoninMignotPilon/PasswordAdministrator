package org.example;

import java.util.Scanner;

public class GestionnaireMdp {
    private Scanner scanner = new Scanner(System.in);
    private Authentification authentification = new Authentification();

    public void executer(){
        System.out.println("Mot de passe d'accès à l'application :");
        String mdp = scanner.nextLine();

        if(!authentification.verificationMdp(mdp)){
            System.out.println("Mot de passe incorect");
            return;

        }

        boolean actif = true;

        while (actif){
            System.out.println("-----Gestionnaire de Mots De Passes-----");
            System.out.println("1. Lister les mots de passe");
            System.out.println("2. Ajouter un mot de passe");
            System.out.println("3. Supprimer un mot de passe");
            System.out.println("4. Quitter");
            System.out.print("> ");
            String choix = scanner.nextLine();


            switch (choix){
                case "1" -> stockage.afficherTous();
                case "2" -> stockage.ajouter(scanner);
                case "3" -> stockage.supprimer(scanner);
                case "4" -> actif = false;
                default -> System.out.println("Choi non reconnu");
            }
        }

}
