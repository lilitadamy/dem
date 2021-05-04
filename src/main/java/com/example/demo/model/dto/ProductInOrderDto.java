package com.example.demo.model.dto;

import com.example.demo.model.entity.Order;
import com.example.demo.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class ProductInOrderDto {
    private Long id;
    private Integer amount;
    private Order order;
    private Product product;
}
