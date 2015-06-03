/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.model;


public class Difficulty {
    
    String difficultyPath;
    String difficultyName;

    public Difficulty(String difficultyPath, String fileName) {
        this.difficultyPath = difficultyPath;
        this.difficultyName = fileName;
    }

    public String getDifficultyPath() {
        return difficultyPath;
    }

    public String getDifficultyName() {
        return difficultyName;
    }
    
    
}
