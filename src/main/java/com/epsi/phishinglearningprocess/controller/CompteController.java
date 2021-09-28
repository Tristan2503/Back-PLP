package com.epsi.phishinglearningprocess.controller;

import com.epsi.phishinglearningprocess.converter.CampagneConverter;
import com.epsi.phishinglearningprocess.converter.CompteConverter;

import com.epsi.phishinglearningprocess.entity.Compte;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class CompteController {

    CompteConverter compteConverter = new CompteConverter();


    @CrossOrigin
    @GetMapping(value="/compte/getAll")
    public ArrayList<Compte> getCompte()
    {
        return compteConverter.getAllComptes();
    }


    @CrossOrigin
    @DeleteMapping(value="/compte/delete")
    public void deleteCompte(@RequestBody Compte compte)
    {
        compteConverter.deleteCompte(compte);
    }

    @CrossOrigin
    @PostMapping(value="/compte/insert")
    public void insertCompte(@RequestBody Compte compte)
    {
        compteConverter.insertCompte(compte);
    }
}
