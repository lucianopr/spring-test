/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author luciano
 */
@Component
public class DataInit implements CommandLineRunner {
    
    private PetRepository petRepository;
    
    @Autowired
    public DataInit(PetRepository petRepository){
        this.petRepository = petRepository;
    }
    
    @Override
    public void run(String... strings) throws Exception{
        
    }
}
