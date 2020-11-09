package com.priya.session5.orderservice.controller;

import com.priya.session5.orderservice.model.OrderEntity;
import com.priya.session5.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="order")
public class OrderController {


    @Autowired
    OrderService orderService;
    @PostMapping
    public ResponseEntity<Boolean> save(@RequestBody OrderEntity orderEntity)
    {
        boolean save = orderService.save(orderEntity);
        if(save)
            return ResponseEntity.status(HttpStatus.CREATED).body(true);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(false);
    }
}
