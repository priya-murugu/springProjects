package com.priya.session3.productservice.service;

import com.priya.session3.productservice.model.ProductEntity;
import com.priya.session3.productservice.repository.ProductEntityRepository;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTest {
@Autowired
    ProductService ps;

    @Test
    void SaveSociable()
    {
        ProductEntity productEntity = ProductEntity.builder().name("iphone11").description("super model").build();
      boolean s=  ps.save(productEntity);
        Assertions.assertThat(s).isTrue();

    }
    @Test
    void saveSolitary()
    {
        ProductService ps = new ProductService();
        ps.productEntityRepository= Mockito.mock(ProductEntityRepository.class);
        Mockito.when(ps.productEntityRepository.save(Mockito.any())).thenReturn(new ProductEntity());
        boolean saved = ps.save(ProductEntity.builder().name("iphone11").description("super model").build());
        Assertions.assertThat(saved).isTrue();
    }




}
