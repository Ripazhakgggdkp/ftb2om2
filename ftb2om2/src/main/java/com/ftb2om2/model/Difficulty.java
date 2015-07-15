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
