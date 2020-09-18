/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.exceptions.TrainerNotFoundException;
import com.example.demo.model.Trainer;
import com.example.demo.repos.TrainerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author arisp
 */
@Service
public class TrainerServiceImpl implements TrainerServiceInterface {

    @Autowired
    TrainerRepository trainerRepository;

    @Override
    @Transactional
    public void saveTrainer(Trainer t) {
        trainerRepository.save(t);

    }

    @Override
    public List<Trainer> getAllTrainers() {
        List<Trainer> result = trainerRepository.findAll();
        return result;

    }

    @Override
    @Transactional
    public boolean deleteTrainerFromId(int id) {
        boolean trainerIsNull = true;
        Optional<Trainer> temp = trainerRepository.findById(id);
        if(!temp.isPresent()) {
            System.out.println("Trainer not found. Invalid id");
            return trainerIsNull;
        }
        else {
            Trainer result = temp.get();
            trainerRepository.delete(result);
            trainerIsNull = false;
            return trainerIsNull;
        }
    }

    @Override
    public Trainer getTrainerFromId(int id) throws TrainerNotFoundException {
        Optional<Trainer> temp = trainerRepository.findById(id);
        if(!temp.isPresent()) {
            throw new TrainerNotFoundException("Trainer with id:  " + id + " does not exist.");
        }
        return temp.get();
    }


}
