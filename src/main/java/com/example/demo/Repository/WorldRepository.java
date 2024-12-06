package com.example.demo.Repository;

import com.example.demo.entity.WorldEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorldRepository extends JpaRepository<WorldEntity, Long> {

    public List<WorldEntity> findById (Long id);
}
