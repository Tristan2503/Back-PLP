package com.epsi.phishinglearningprocess.entity;

public class Identifiant {
    private int identifiant_kn;
    private String nom;
    private String motDePasse;

    public Identifiant(int identifiant_kn, String nom, String motDePasse) {
        this.identifiant_kn = identifiant_kn;
        this.nom = nom;
        this.motDePasse = motDePasse;
    }

    public Identifiant() {
    }

    public int getIdentifiant_kn() {
        return identifiant_kn;
    }

    public void setIdentifiant_kn(int identifiant_kn) {
        this.identifiant_kn = identifiant_kn;
    }

    public String getIdentifiant() {
        return nom;
    }

    public void setIdentifiant(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
