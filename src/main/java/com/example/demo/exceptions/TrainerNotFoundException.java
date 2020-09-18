/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.exceptions;

/**
 *
 * @author arisp
 */
public class TrainerNotFoundException extends Exception {
    public TrainerNotFoundException(String error) {
        super(error);
    }

}
