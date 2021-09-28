package com.epsi.phishinglearningprocess.controller;


import com.epsi.phishinglearningprocess.converter.CampagneConverter;
import com.epsi.phishinglearningprocess.entity.Campagne;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class CampagneController {

    CampagneConverter campagneConverter = new CampagneConverter();


    @CrossOrigin
    @GetMapping(value="/campagne/getAll")
    public ArrayList<Campagne> getCampagnes()
    {
        return campagneConverter.getAllCampagnes();
    }


    @CrossOrigin
    @DeleteMapping(value="/campagne/delete")
    public void deleteCampagne(@RequestBody Campagne campagne)
    {
        campagneConverter.deleteCampagne(campagne);
    }

    @CrossOrigin
    @PostMapping(value="/campagne/insert")
    public void insertCampagne(@RequestBody Campagne campagne)
    {
        campagneConverter.insertCampagne(campagne);
    }




}
