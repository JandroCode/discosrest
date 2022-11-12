package com.discos.discosrest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discos.discosrest.model.Category;
import com.discos.discosrest.service.CategoryService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/category")
public class CategoryController {

  @Autowired
  private CategoryService categoryService;

  @GetMapping("/list")
  public ResponseEntity<?> list(){

    Map<String,Object> map = new HashMap<>();
    List<Category> categories = new ArrayList<>();

    try{
       categories = categoryService.categeoriesList();
    }catch(DataAccessException e){
      map.put("error", "Error de conexión a la base de datos " + e.getCause().getMessage());
      return new ResponseEntity<Map<String,Object>>(map ,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<List<Category>>(categories,HttpStatus.OK);
  }
  
}
