package com.epsi.phishinglearningprocess.service;


import com.epsi.phishinglearningprocess.ConnectionBaseDeDonnee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BackReferentielService {

    private ResultSet resultats;
    private ConnectionBaseDeDonnee connectionBaseDeDonnee;

    public BackReferentielService()
    {
        connectionBaseDeDonnee=new ConnectionBaseDeDonnee();
    }

    public ResultSet askDatabase(String sqlRequest)
    {
        try {
            Statement statement = connectionBaseDeDonnee.getConnection().createStatement();
            resultats = statement.executeQuery(sqlRequest);
            /*connectionBaseDeDonnee.getConnection().close();*/
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultats;
    }

    public String updateDatabase(String sqlRequest)
    {
        HttpHeaders responseHeaders = new HttpHeaders();
        try {
            System.out.println(sqlRequest);
            Statement statement = connectionBaseDeDonnee.getConnection().createStatement();
            statement.executeUpdate(sqlRequest);
            ResponseEntity succes= new ResponseEntity<String>("Succès de la transaction", responseHeaders, HttpStatus.CREATED);
            return succes.toString();
        } catch (SQLException throwables) {
            ResponseEntity echec = new ResponseEntity<String>("Echec de la transaction", responseHeaders, HttpStatus.BAD_REQUEST);
            System.out.println(echec.toString());
            return echec.toString();
        }
    }

    public String deleteDatabase(String sqlRequest)
    {
        HttpHeaders responseHeaders = new HttpHeaders();
        try {
            System.out.println(sqlRequest);
            Statement statement = connectionBaseDeDonnee.getConnection().createStatement();
            statement.executeQuery(sqlRequest);
            ResponseEntity succes= new ResponseEntity<String>("Succès de la transaction", responseHeaders, HttpStatus.CREATED);
            return succes.toString();
        } catch (SQLException throwables) {
            ResponseEntity echec = new ResponseEntity<String>("Echec de la transaction", responseHeaders, HttpStatus.BAD_REQUEST);
            System.out.println(echec.toString());
            return echec.toString();
        }
    }


}
