package com.floristeria.FloristeriaJaputa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Product {

    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    private String name;
    @Getter @Setter
    private double price;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    //constructores
    public Product() {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
