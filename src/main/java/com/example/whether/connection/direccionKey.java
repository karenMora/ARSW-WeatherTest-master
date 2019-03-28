/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.whether.connection;

import org.springframework.stereotype.Service;

/**
 *
 * @author 2092692
 */
@Service
public class direccionKey implements getUrl{

    @Override
    public String getUrl(String name) {
        return "api.openweathermap.org/data/2.5/weather?&apikey=eb5e57fc713859db8a78cfe5ba5457d3&c="+name;
    }
    
}
