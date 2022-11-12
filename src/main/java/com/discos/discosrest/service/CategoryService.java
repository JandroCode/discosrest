package com.discos.discosrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discos.discosrest.model.Category;
import com.discos.discosrest.repository.ICategoryRepository;

@Service
public class CategoryService {

  @Autowired
  private ICategoryRepository categoryRepository;

  public List<Category> categeoriesList(){
    return categoryRepository.findAll();
  }
  
}
