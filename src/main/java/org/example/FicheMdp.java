package org.example;

public class FicheMdp {
    private final String site;
    private final String identifiant;
    private final String motDePasse;

    public FicheMdp(String site, String identifiant, String motDePasse){
        this.site = site;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    public String getSite(){
        return site;
    }
    public String toString(){
        return site + "|" + identifiant + "|" + motDePasse;
    }
}
