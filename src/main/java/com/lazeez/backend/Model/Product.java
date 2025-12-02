package com.lazeez.backend.Model;

import com.lazeez.backend.Enum.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @ManyToOne
    @JoinColumn(name="seller_id")
    private Seller seller;



    @ManyToMany(mappedBy = "products")
    List<OrderEntity> orders = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cart_id")
    Cart cart;
}
