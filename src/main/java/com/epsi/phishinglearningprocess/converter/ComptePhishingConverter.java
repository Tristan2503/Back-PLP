package com.epsi.phishinglearningprocess.converter;

import com.epsi.phishinglearningprocess.entity.Campagne;
import com.epsi.phishinglearningprocess.entity.Compte;
import com.epsi.phishinglearningprocess.entity.ComptePhishing;
import com.epsi.phishinglearningprocess.service.BackReferentielService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComptePhishingConverter {
    private ArrayList<ComptePhishing> listeComptePhishingConverter;
    private ResultSet resultat;
    private BackReferentielService backReferentielService = new BackReferentielService();



    public ArrayList<ComptePhishing> getAllComptesPhishing()
    {
        resultat= backReferentielService.askDatabase("SELECT comptePhishing_kn,email,motDePasse FROM comptePhishing");
        convertiseurComptePhishing();
        return listeComptePhishingConverter;
    }

    public void deleteComptePhishing(ComptePhishing comptePhishing)
    {
        backReferentielService.askDatabase("INSERT INTO comptePhishing VALUES ("+comptePhishing.getComptePhishing_kn()+",'"+comptePhishing.getEmail()+"','"+comptePhishing.getMotDePasse()+"')");
    }

    public void insertComptePhishing(ComptePhishing comptePhishing)
    {
        backReferentielService.deleteDatabase("DELETE FROM comptePhishing WHERE comptePhishing_kn="+comptePhishing.getComptePhishing_kn()+"");
    }

    public void deleteCampagne(Campagne campagne)
    {
        backReferentielService.askDatabase("INSERT INTO campagne VALUEs ("+campagne.getCampagne_kn()+","+campagne.getComptePhishing_kn()+",'"+campagne.getMessage()+"','"+campagne.getMessage()+"','"+campagne.getObjet()+"',"+campagne.getDateLancement()+")");
    }

    public void insertCampagne(Campagne campagne)
    {
        backReferentielService.deleteDatabase("DELETE FROM campagne WHERE campagne_kn="+campagne.getCampagne_kn()+"");
    }


    public ArrayList<ComptePhishing> convertiseurComptePhishing()
    {
        listeComptePhishingConverter=new ArrayList<>();
        try
        {
            while(resultat.next())
            {
                listeComptePhishingConverter.add(new ComptePhishing(resultat.getInt(1),resultat.getString(2),resultat.getString(3)));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listeComptePhishingConverter;
    }


}
