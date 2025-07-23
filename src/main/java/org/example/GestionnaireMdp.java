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

}
