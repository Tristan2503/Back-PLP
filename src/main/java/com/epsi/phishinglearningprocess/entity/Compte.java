package com.epsi.phishinglearningprocess.entity;

public class Compte {
    private int compte_kn;
    private int campagne_kn;
    private int etat_kn;
    private String prenom;
    private String nom;
    private String pole;
    private String email;
    private int compteur;


    public Compte(int compte_kn, int campagne_kn, int etat_kn, String prenom, String nom, String pole, String email, int compteur) {
        this.compte_kn = compte_kn;
        this.campagne_kn = campagne_kn;
        this.etat_kn = etat_kn;
        this.prenom = prenom;
        this.nom = nom;
        this.pole = pole;
        this.email = email;
        this.compteur = compteur;
    }

    public Compte() {
    }

    public int getCompte_kn() {
        return compte_kn;
    }

    public void setCompte_kn(int compte_kn) {
        this.compte_kn = compte_kn;
    }

    public int getCampagne_kn() {
        return campagne_kn;
    }

    public void setCampagne_kn(int campagne_kn) {
        this.campagne_kn = campagne_kn;
    }

    public int getEtat_kn() {
        return etat_kn;
    }

    public void setEtat_kn(int etat_kn) {
        this.etat_kn = etat_kn;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPole() {
        return pole;
    }

    public void setPole(String pole) {
        this.pole = pole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
}
