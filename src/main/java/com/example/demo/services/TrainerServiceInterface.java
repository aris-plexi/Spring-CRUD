/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.exceptions.TrainerNotFoundException;
import com.example.demo.model.Trainer;
import java.util.List;

/**
 *
 * @author arisp
 */
public interface TrainerServiceInterface {

    public void saveTrainer(Trainer t);

    public List<Trainer> getAllTrainers();

    public Trainer getTrainerFromId(int id) throws TrainerNotFoundException;

    public boolean deleteTrainerFromId(int id);



}
