package com.teashop.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString(exclude = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private String image;

    @Getter
    @Setter
    private Long price;

    @ManyToOne
    @Getter
    @Setter
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
