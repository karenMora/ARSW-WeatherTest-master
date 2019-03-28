/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.whether.controllers;

import com.example.whether.services.weatherServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2092692
 */
@RestController
@RequestMapping(value="/weather")
@Service
public class weatherApiController {
    @Autowired
    private weatherServices servives;
    
    @RequestMapping(method = RequestMethod.GET,value="/{name}" , consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getMovie(@PathVariable("name") String name){
        try{
            return new ResponseEntity<>(servives.getCityByName(name),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(weatherApiController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
    
}
