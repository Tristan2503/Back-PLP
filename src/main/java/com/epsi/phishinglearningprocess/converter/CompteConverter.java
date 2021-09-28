package com.epsi.phishinglearningprocess.converter;

import com.epsi.phishinglearningprocess.entity.Campagne;
import com.epsi.phishinglearningprocess.entity.Compte;
import com.epsi.phishinglearningprocess.service.BackReferentielService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompteConverter {

    private ArrayList<Compte> listeCompte;
    private ResultSet resultat;
    private BackReferentielService backReferentielService = new BackReferentielService();



    public ArrayList<Compte> getAllComptes()
    {
        resultat= backReferentielService.askDatabase("SELECT compte_kn,campagne_kn,etat_kn,prenom,nom,pole,email,compteur FROM compte");
        convertiseurConverter();
        return listeCompte;
    }

    public void deleteCompte(Compte compte)
    {
        backReferentielService.askDatabase("INSERT INTO compte VALUES ("+compte.getCampagne_kn()+","+compte.getCampagne_kn()+","+compte.getEtat_kn()+",'"+compte.getPrenom()+"','"+compte.getNom()+"','"+compte.getPole()+"','"+compte.getEmail()+"',"+compte.getCompteur()+")");
    }

    public void insertCompte(Compte compte)
    {
        backReferentielService.deleteDatabase("DELETE FROM compte WHERE compte_kn="+compte.getCompte_kn()+"");
    }


    public ArrayList<Compte> convertiseurConverter()
    {
        listeCompte=new ArrayList<>();
        try
        {
            while(resultat.next())
            {
                listeCompte.add(new Compte(resultat.getInt(1),resultat.getInt(2),resultat.getInt(3),resultat.getString(4),resultat.getString(5),resultat.getString(6),resultat.getString(7),resultat.getInt(8)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listeCompte;
    }
}
