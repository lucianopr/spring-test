/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.entity.Pet;
import com.example.repository.PetRepository;
import java.util.List;
import java.util.stream;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
    @GetMapping("/all")
    public List<Pet> listPets(){
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
    
    @GetMapping("/filter/{species}/{zone}/{race}/{text}")
    public List<Pet> listPetsWithFilter(@PathVariable String species, @PathVariable Long zone, @PathVariable String race, @PathVariable String text){
        return petRepository.stream().filter(x -> x.getSpecies() == species && x.getZoneId() == zone && x.getRace() == race && x.getDistinctive().indexOf(text) != -1 )
                .collect(Collectors.toList());
    }
    
    @RequestMapping(value = "/addPet", method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    public List<Pet> addPet(@RequestBody Pet pet){
        petRepository.add(pet);
        return (List<Pet>) petRepository;
    }
    
    
}
