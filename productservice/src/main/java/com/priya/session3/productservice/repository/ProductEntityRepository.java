package com.priya.session3.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.priya.session3.productservice.model.ProductEntity;

import java.util.Optional;

@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity,Integer> {

    Optional<ProductEntity> findByName(String Name);
}
