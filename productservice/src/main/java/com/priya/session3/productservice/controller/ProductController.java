package com.priya.session3.productservice.controller;

import com.priya.session3.productservice.model.ProductEntity;
import com.priya.session3.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="product")
public class ProductController {

    @Autowired
    ProductService productService;
@PostMapping
    public ResponseEntity<Boolean> save(@RequestBody ProductEntity productEntity)
    {
        boolean save = productService.save(productEntity);
        if(save)
            return ResponseEntity.status(HttpStatus.CREATED).body(true);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
    }
@GetMapping
    public ResponseEntity<Boolean> isExists(@RequestParam(name="name") String name)
    {
       boolean isExists=productService.isExists(name);
        if(isExists)
            return ResponseEntity.status(HttpStatus.OK).body(true);
        else
            return ResponseEntity.status(HttpStatus.OK).body(false);
    }
}
