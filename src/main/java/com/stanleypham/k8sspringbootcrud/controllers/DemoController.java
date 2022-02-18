package com.stanleypham.k8sspringbootcrud.controllers;

import com.stanleypham.k8sspringbootcrud.entities.DemoEntity;
import com.stanleypham.k8sspringbootcrud.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/all")
    public List<DemoEntity> getAll() {
        return demoService.getAll();
    }

    @GetMapping(value = "/{id}")
    public DemoEntity getById(@PathVariable int id) {
        return demoService.getById(id);
    }

    @PostMapping(value = "/add")
    public DemoEntity addItem(@RequestBody DemoEntity entity) {
        return demoService.addItem(entity);
    }
}
