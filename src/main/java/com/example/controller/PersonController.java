/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author luciano
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    
    private final PersonRepository personRepository;
    
    @Autowired
    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    
    @GetMapping
    public List<Person> listPersons(){
        return personRepository.findAll();
    }
    
    @GetMapping("/insert")
    public String insert(){
        Boolean perm = true;
        for(int i=0; i<3; i++){
            personRepository.save(new Person("name_"+i, perm, "email_"+i+"@mail.com"));
            perm = false;
        }
        return "person saved";
    }
    
}
