package com.stanleypham.k8sspringbootcrud.services;

import com.stanleypham.k8sspringbootcrud.entities.DemoEntity;
import com.stanleypham.k8sspringbootcrud.repositories.DemoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DemoService {
    private final DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public List<DemoEntity> getAll() {
        return demoRepository.findAll();
    }

    public DemoEntity addItem(DemoEntity demoEntity) {
        return demoRepository.save(demoEntity);
    }

    public DemoEntity getById(int id) {
        return demoRepository.findById(id);
    }
}
