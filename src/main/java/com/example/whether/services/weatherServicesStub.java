/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.whether.services;

import com.example.whether.connection.HttpConnectionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2092692
 */
@Service
public class weatherServicesStub implements weatherServices{
    @Autowired
    HttpConnectionExample connection;
    
    private String temp;
    
            @Override
    public String getCityByName(String name) {
        temp=name;
        connection.connect(name);
        connection.run();
        temp= connection.getResult();
        return temp;
    }
        
       
}
