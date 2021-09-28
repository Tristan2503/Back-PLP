package com.epsi.phishinglearningprocess.controller;

import com.epsi.phishinglearningprocess.converter.ComptePhishingConverter;
import com.epsi.phishinglearningprocess.converter.IdentifiantConverter;
import com.epsi.phishinglearningprocess.entity.ComptePhishing;
import com.epsi.phishinglearningprocess.entity.Identifiant;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class IdentifiantController {

    IdentifiantConverter identifiantConverter = new IdentifiantConverter();


    @CrossOrigin
    @GetMapping(value="/identifiant/getAll")
    public ArrayList<Identifiant> getIdentifiants()
    {
        return identifiantConverter.getAllIdentifiants();
    }


    @CrossOrigin
    @DeleteMapping(value="/identifiant/delete")
    public void deleteMessage(@RequestBody Identifiant identifiant)
    {
        identifiantConverter.deleteIdentifiant(identifiant);
    }

    @CrossOrigin
    @PostMapping(value="/identifiant/insert")
    public void insertCampagne(@RequestBody Identifiant identifiant)
    {
        identifiantConverter.insertIdentifiant(identifiant);
    }
}
