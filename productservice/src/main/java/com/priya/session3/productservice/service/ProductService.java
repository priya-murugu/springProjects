package com.priya.session3.productservice.service;

import com.priya.session3.productservice.model.ProductEntity;
import com.priya.session3.productservice.repository.ProductEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductEntityRepository productEntityRepository;
    public boolean save(ProductEntity productEntity)
    {
        ProductEntity productEntity1 = productEntityRepository.save(productEntity);
        return productEntity1 != null;
    }
    public boolean isExists(String name)
    {
        return productEntityRepository.findByName(name).isPresent();
    }


}
