package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Model{
    @Id
    @GeneratedValue
    private Long id;

    private String testText;

    public Model(String testText) {
        this.testText = testText;
    }
}
