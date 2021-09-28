package com.epsi.phishinglearningprocess.entity;

import java.util.Date;

public class Campagne {
    private int campagne_kn;
    private int comptePhishing_kn;
    private String message;
    private String objet;
    private Date dateLancement;

    public Campagne(int campagne_kn, int comptePhishing_kn, String message, String objet, Date dateLancement) {
        this.campagne_kn = campagne_kn;
        this.comptePhishing_kn = comptePhishing_kn;
        this.message = message;
        this.objet = objet;
        this.dateLancement = dateLancement;
    }

    public Campagne() {
    }

    public int getCampagne_kn() {
        return campagne_kn;
    }

    public void setCampagne_kn(int campagne_kn) {
        this.campagne_kn = campagne_kn;
    }

    public int getComptePhishing_kn() {
        return comptePhishing_kn;
    }

    public void setComptePhishing_kn(int comptePhishing_kn) {
        this.comptePhishing_kn = comptePhishing_kn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Date getDateLancement() {
        return dateLancement;
    }

    public void setDateLancement(Date dateLancement) {
        this.dateLancement = dateLancement;
    }
}
