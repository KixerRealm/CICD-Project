package com.example.backend.service;

import com.example.backend.model.Model;
import com.example.backend.model.dto.ModelDto;

import java.util.List;
import java.util.Optional;

public interface ModelService {
    List<Model> findAll();

    Optional<Model> add(ModelDto modelDto);
}
