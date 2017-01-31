/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author luciano
 */
@Entity
@Table(name = "pet")
public class Pet implements Serializable {

    public Pet() {
    }

    public Pet(String name, String birth, Long species, String race, String color, String distinctive, Long zone_id) {
        this.name = name;
        this.birth = birth;
        this.species = species;
        this.race = race;
        this.color = color;
        this.distinctive = distinctive;
        this.zone_id = zone_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birth
     */
    public String getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }

    /**
     * @return the species
     */
    public Long getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(Long species) {
        this.species = species;
    }

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the distinctive
     */
    public String getDistinctive() {
        return distinctive;
    }

    /**
     * @param distinctive the distinctive to set
     */
    public void setDistinctive(String distinctive) {
        this.distinctive = distinctive;
    }

    /**
     * @return the zone_id
     */
    public Long getZone_id() {
        return zone_id;
    }

    /**
     * @param zone_id the zone_id to set
     */
    public void setZone_id(Long zone_id) {
        this.zone_id = zone_id;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "birth")
    private String birth;
    @Column(name = "species")
    private Long species;
    @Column(name = "race")
    private String race;
    @Column(name = "color")
    private String color;
    @Column(name = "distinctive")
    private String distinctive;
    @Column(name = "zone_id")
    private Long zone_id;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
