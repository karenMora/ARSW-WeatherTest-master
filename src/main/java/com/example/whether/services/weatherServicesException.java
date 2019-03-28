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
public class weatherServicesException extends Exception{
    
    public weatherServicesException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public weatherServicesException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
