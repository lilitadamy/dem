package com.example.demo.model.dto;

import com.example.demo.model.entity.Order;
import com.example.demo.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter@Setter
public class TableDto {
    private Long id;
    private List<Order> orders;
    private User waiter;
}
