package com.stanleypham.k8sspringbootcrud.repositories;

import com.stanleypham.k8sspringbootcrud.entities.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoEntity, Integer> {
    DemoEntity findById(int id);
}
