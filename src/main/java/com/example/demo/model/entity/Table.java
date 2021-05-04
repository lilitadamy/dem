package com.example.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "table")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @OneToMany
    private List<Order> orders;
    @Column
    @ManyToOne
    private User waiter;
}
