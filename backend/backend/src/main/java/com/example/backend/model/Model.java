package com.example.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

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
