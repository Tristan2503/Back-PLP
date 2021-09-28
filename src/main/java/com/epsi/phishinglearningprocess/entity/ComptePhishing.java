package com.epsi.phishinglearningprocess.entity;

import java.util.ArrayList;

public class ComptePhishing {
    private int comptePhishing_kn;
    private String email;
    private String motDePasse;

    public ComptePhishing(int comptePhishing_kn, String email, String motDePasse) {
        this.comptePhishing_kn = comptePhishing_kn;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public ComptePhishing() {
    }

    public int getComptePhishing_kn() {
        return comptePhishing_kn;
    }

    public void setComptePhishing_kn(int comptePhishing_kn) {
        this.comptePhishing_kn = comptePhishing_kn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
