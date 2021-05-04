package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter@Setter
public class ProductDto {
    private Long id;
    private String productName;
    private Double productPrice;
}
