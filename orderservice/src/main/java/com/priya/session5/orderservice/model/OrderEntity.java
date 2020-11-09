package com.priya.session5.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Table(name = "product_order")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderEntity {
    @Id
            @GeneratedValue

Integer id;
    @Column(name="userId")
String userId;
    @Column(name="name")
String name;
    @Column(name="description")
String description;
}
