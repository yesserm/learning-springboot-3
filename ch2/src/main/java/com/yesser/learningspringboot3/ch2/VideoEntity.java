package com.yesser.learningspringboot3.ch2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class VideoEntity {
    private @Id @GeneratedValue Long id;
    private String name;
    private String description;

    protected VideoEntity() {}
    VideoEntity(String name, String description) {
        this.id = null;
        this.name = name;
        this.description = description;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setDescription(String value) {
        this.description = value;
    }
}
