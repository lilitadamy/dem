package com.example.demo.model.dto;

import com.example.demo.model.entity.ProductInOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class OrderDto {
    private Long id;
    private String status;
    private double totalPrice;
    private List<ProductInOrder> productsInOrder;
}
