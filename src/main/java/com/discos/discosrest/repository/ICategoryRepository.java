package com.discos.discosrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discos.discosrest.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
  
}
