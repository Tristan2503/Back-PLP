package com.epsi.phishinglearningprocess.converter;

import com.epsi.phishinglearningprocess.entity.Campagne;
import com.epsi.phishinglearningprocess.service.BackReferentielService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class CampagneConverter {

    private ArrayList<Campagne> listeCampagne;
    private ResultSet resultat;
    private BackReferentielService backReferentielService = new BackReferentielService();



    public ArrayList<Campagne> getAllCampagnes()
    {
        resultat= backReferentielService.askDatabase("SELECT campagne_kn,comptePhishing_kn,message,objet,dateLancement FROM campagne");
        convertiseurCampagne();
        return listeCampagne;
    }

    public void deleteCampagne(Campagne campagne)
    {
         backReferentielService.askDatabase("INSERT INTO campagne VALUES ("+campagne.getCampagne_kn()+","+campagne.getComptePhishing_kn()+",'"+campagne.getMessage()+"','"+campagne.getMessage()+"','"+campagne.getObjet()+"',"+campagne.getDateLancement()+")");
    }

    public void insertCampagne(Campagne campagne)
    {
        backReferentielService.deleteDatabase("DELETE FROM campagne WHERE campagne_kn="+campagne.getCampagne_kn()+"");
    }


    public ArrayList<Campagne> convertiseurCampagne()
    {
        listeCampagne=new ArrayList<>();
        try
        {
            while(resultat.next())
            {
                listeCampagne.add(new Campagne(resultat.getInt(1),resultat.getInt(2),resultat.getString(3),resultat.getString(4),resultat.getDate(4)));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listeCampagne;
    }

}
