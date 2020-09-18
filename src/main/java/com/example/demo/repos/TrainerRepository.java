/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repos;

import com.example.demo.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author arisp
 */
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
    
    
}
