/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josecastro.primerspring.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Castro
 */
@RestController
@RequestMapping(value = "/reportes")
public class Reportes {
    @RequestMapping(value = "/minombre/{nom}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String getNombre(@PathVariable("nom")  String nom) {

        return "mi nombre es "+nom;
    }
    
    @RequestMapping(value = "/completo/{nom}/{ape}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String getNombre(@PathVariable("nom") String nom,@PathVariable("ape") String ape) {

        return "mi nombre completo es "+nom+" "+ape;
    }
}
