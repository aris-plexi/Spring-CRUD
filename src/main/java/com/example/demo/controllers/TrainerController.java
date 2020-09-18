/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

import com.example.demo.exceptions.TrainerNotFoundException;
import com.example.demo.model.Trainer;
import com.example.demo.services.TrainerServiceInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;

/**
 * @author arisp
 */
@Controller
public class TrainerController {

    @Autowired
    TrainerServiceInterface trainerServiceInterface;

    @RequestMapping("/")
    public String redirectPage() {
        return "redirect:createtrainer";
    }

    @GetMapping("/createtrainer")
    public String createTrainer(ModelMap mm) {
        mm.addAttribute("newtrainer", new Trainer());
        return "createtrainer";
    }

    @PostMapping("/docreatetrainer")
    public String doCreateTrainer(ModelMap mm,
                                  @Valid @ModelAttribute("newtrainer") Trainer t, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "createtrainer";
        }
        trainerServiceInterface.saveTrainer(t);
        return "resultPage";
    }

    @GetMapping("/readtrainers")
    public String readTrainers(ModelMap mm) {
        List<Trainer> result = trainerServiceInterface.getAllTrainers();
        mm.addAttribute("trainers", result);

        return "readtrainers";
    }

    @GetMapping("/readtrainers/delete={id}")
    public String deleteTrainer(ModelMap mm,
                                @PathVariable int id) {
        boolean entityIsNull;
        entityIsNull = trainerServiceInterface.deleteTrainerFromId(id);
        if (!entityIsNull) {
            return "redirect:/readtrainers";
        } else {
            mm.addAttribute("id", id);
            return "idoutofbounds";
        }
    }

    @GetMapping("/readtrainers/update={id}")
    public String updateTrainer(ModelMap mm,
                                @PathVariable int id) {
        try {
            Trainer t = trainerServiceInterface.getTrainerFromId(id);
            mm.addAttribute("trainertoupdate", t);
            return "updatetrainer";
        } catch (TrainerNotFoundException tr) {
            System.out.println(tr.getMessage());
            tr.printStackTrace();
            mm.addAttribute("id", id);
            return "idoutofbounds";
        }
    }

    @PostMapping("/readtrainers/doupdatetrainer")
    public String doUpdateTrainer(ModelMap mm,
                                  @ModelAttribute("trainertoupdate") Trainer t) {
        System.out.println(t.getId());
        trainerServiceInterface.saveTrainer(t);
        return "redirect:/readtrainers";
    }
}
