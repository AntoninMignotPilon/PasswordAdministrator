package org.example;

import java.nio.file.*;
import java.security.MessageDigest;
import java.util.Base64;

public class GestionAuthentification {
    private static final Path FichierCle = Paths.get("CleMdpMaitre.txt");

    public boolean verificationMdp(String mdpSaisie){
        try {
            if (Files.exists(FichierCle)){
                String hashStocke = Files.readString(FichierCle);
                return hashStocke.equals(hacher(mdpSaisie));
            } else {
                System.out.println("Aucun mot de passe trouvé. Création...");
                Files.writeString(FichierCle, hacher(mdpSaisie));
                return true;
            }
        } catch (Exception e){
            System.out.println("Erreur :" + e);
            return false;
        }
    }
    private String hacher(String texte) throws Exception{
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = digest.digest(texte.getBytes());
        return Base64.getEncoder().encodeToString(bytes);
    }
}
