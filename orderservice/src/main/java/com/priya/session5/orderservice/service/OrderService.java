package com.priya.session5.orderservice.service;

import com.priya.session5.orderservice.model.OrderEntity;
import com.priya.session5.orderservice.repository.OrderEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {


        @Autowired
        OrderEntityRepository orderEntityRepository;

        @Autowired
        RestTemplate restTemplate;
        public boolean save(OrderEntity orderEntity)
        {
            ResponseEntity<Boolean> forEntity = restTemplate.getForEntity("http://productservice/product?name=" + orderEntity.getName(), Boolean.class);
            if(forEntity.getBody()) {
                OrderEntity orderEntity1 = orderEntityRepository.save(orderEntity);
                return orderEntity1 != null;
            }
            return false;
        }
       // public boolean isExists(String name)
      //  {
          //  return productEntityRepository.findByName(name).isPresent();
       // }



}
