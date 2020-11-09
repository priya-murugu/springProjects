package com.priya.session3.productservice.repository;

import com.priya.session3.productservice.model.ProductEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class ProductEntityRepositoryTest {

    @Autowired
    ProductEntityRepository productEntityRepository =null;


    @Test
    void test()
    {
        System.out.println("hi");

    }
    @Test
    void shouldSaveAProduct()
    {
        ProductEntity productEntity = ProductEntity.builder().name("iphone11").description("super model").build();
        productEntityRepository.save(productEntity);
       // Optional<ProductEntity> first = productEntityRepository.findAll().stream().findFirst();
        Optional<ProductEntity> pe = productEntityRepository.findByName(productEntity.getName());
        Assertions.assertThat(pe.get()).isEqualTo(productEntity);



    }


}
