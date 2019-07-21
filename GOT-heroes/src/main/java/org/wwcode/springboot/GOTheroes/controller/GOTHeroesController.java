package org.wwcode.springboot.GOTheroes.controller;

import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.wwcode.springboot.GOTheroes.models.GOTHero;
import org.wwcode.springboot.GOTheroes.services.GOTService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/GOT")
public class GOTHeroesController {

    @Value("${got.some-prop}")
    private String propertyValue;

    @Autowired
    GOTService gotService;

    @RequestMapping(path = "/heroes", method = RequestMethod.GET)
    public @ResponseBody List<GOTHero> heroes() {
        System.out.println("The property value is ==> "+propertyValue);
        List<GOTHero> heroes = gotService.getAllHeroes();
        return heroes;
    }

    @RequestMapping(path = "/hero/{id}", method = RequestMethod.GET, produces =  "application/json")
    public @ResponseBody GOTHero hero(@PathVariable int id, @RequestParam String param) {
        System.out.println("id = ["+id+"], param = ["+param+"]");
        return new GOTHero();
    }

}
