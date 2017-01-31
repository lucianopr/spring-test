/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.entity.Pet;
import com.example.repository.PetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luciano
 */
@RestController
@RequestMapping("/pet")
public class PetController {
    
    private final PetRepository petRepository;
    
    @Autowired
    public PetController(PetRepository petRepository){
        this.petRepository = petRepository;
    }
    
    @GetMapping
    public List<Pet> listPetss(){
        return petRepository.findAll();
    }
    
    @GetMapping("/insert")
    public String insert(){
        Boolean perm;
        for(int i=0; i<10; i++){
            //(String name, String birth, Long species, String race, String color, String distinctive, Long zone_id)
            petRepository.save(new Pet("pet_name_"+i, "1900-01-01", Long.valueOf(123), "race"+i, "color"+i, "distinctive features", Long.valueOf(1234)));
        }
        return "pet saved";
    }
    
}
