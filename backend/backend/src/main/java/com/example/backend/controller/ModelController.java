package com.example.backend.controller;

import com.example.backend.model.Model;
import com.example.backend.model.dto.ModelDto;
import com.example.backend.service.ModelService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
@AllArgsConstructor
public class ModelController {

    private final ModelService modelService;

    @GetMapping("/list-all")
    private List<Model> listAll(){
        return this.modelService.findAll();
    }

    @PostMapping("/add-model")
    private ResponseEntity<Model> add(@RequestBody ModelDto modelDto){
        return this.modelService.add(modelDto)
                .map(model -> ResponseEntity.ok().body(model))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
