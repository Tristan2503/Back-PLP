package com.epsi.phishinglearningprocess.converter;

import com.epsi.phishinglearningprocess.entity.Campagne;
import com.epsi.phishinglearningprocess.entity.ComptePhishing;
import com.epsi.phishinglearningprocess.entity.Identifiant;
import com.epsi.phishinglearningprocess.service.BackReferentielService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IdentifiantConverter {
    private ArrayList<Identifiant> listeIdentifiants;
    private ResultSet resultat;
    private BackReferentielService backReferentielService = new BackReferentielService();



    public ArrayList<Identifiant> getAllIdentifiants()
    {
        resultat= backReferentielService.askDatabase("SELECT identifiant_kn,nom,motDePasse FROM identifiant");
        convertiseurIdentifiant();
        return listeIdentifiants;
    }

    public void deleteIdentifiant(Identifiant identifiant)
    {
        backReferentielService.askDatabase("INSERT INTO comptePhishing VALUES ("+identifiant.getIdentifiant_kn()+",'"+identifiant.getIdentifiant_kn()+"','"+identifiant.getMotDePasse()+"')");
    }

    public void insertIdentifiant(Identifiant identifiant)
    {
        backReferentielService.deleteDatabase("DELETE FROM identifiant WHERE identifiant_kn="+identifiant.getIdentifiant()+"");
    }


    public ArrayList<Identifiant> convertiseurIdentifiant()
    {
        listeIdentifiants=new ArrayList<>();
        try
        {
            while(resultat.next())
            {
                listeIdentifiants.add(new Identifiant(resultat.getInt(1),resultat.getString(2),resultat.getString(3)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listeIdentifiants;
    }

}
