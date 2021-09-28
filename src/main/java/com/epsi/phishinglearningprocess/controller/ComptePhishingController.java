package com.epsi.phishinglearningprocess.controller;

import com.epsi.phishinglearningprocess.converter.CompteConverter;
import com.epsi.phishinglearningprocess.converter.ComptePhishingConverter;
import com.epsi.phishinglearningprocess.entity.Compte;
import com.epsi.phishinglearningprocess.entity.ComptePhishing;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class ComptePhishingController {

    ComptePhishingConverter comptePhishingConverter = new ComptePhishingConverter();


    @CrossOrigin
    @GetMapping(value="/comptePhishing/getAll")
    public ArrayList<ComptePhishing> getCampagnes()
    {
        return comptePhishingConverter.getAllComptesPhishing();
    }


    @CrossOrigin
    @DeleteMapping(value="/comptePhishing/delete")
    public void deleteMessage(@RequestBody ComptePhishing comptePhishing)
    {
        comptePhishingConverter.deleteComptePhishing(comptePhishing);
    }

    @CrossOrigin
    @PostMapping(value="/comptePhishing/insert")
    public void insertCampagne(@RequestBody ComptePhishing comptePhishing)
    {
        comptePhishingConverter.insertComptePhishing(comptePhishing);
    }
}
