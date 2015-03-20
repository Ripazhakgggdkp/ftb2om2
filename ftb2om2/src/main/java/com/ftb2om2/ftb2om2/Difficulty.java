package com.ftb2om2.ftb2om2;

public class Difficulty {
    private String name;
    private String path;
    private Boolean status;

    public Difficulty() {
    }

    public Difficulty(String name, String path, Boolean status) {
        this.name = name;
        this.path = path;
        this.status = status;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
    
}
