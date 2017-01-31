/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repository;

import com.example.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author luciano
 */
public interface ZoneRepository extends JpaRepository<Zone, Long> {
    
}
