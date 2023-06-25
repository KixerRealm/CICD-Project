package com.example.backend.service.implementation;

import com.example.backend.model.Model;
import com.example.backend.model.dto.ModelDto;
import com.example.backend.repository.ModelRepository;
import com.example.backend.service.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ModelServiceImplementation implements ModelService {

    private final ModelRepository modelRepository;
    @Override
    public List<Model> findAll() {
        return this.modelRepository.findAll();
    }

    @Override
    public Optional<Model> add(ModelDto modelDto) {
        return Optional.of(this.modelRepository.save(new Model(modelDto.getTestText())));
    }
}
