package com.floristeria.FloristeriaJaputa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "flowers")
public class Flower {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(name = "color")
    private String color;

    @Getter @Setter
    @Column(name = "price")
    private double price;

    // Constructores
    public Flower(){

    }

    public Flower(String color, double price){
        this.color = color;
        this.price = price;
    }

}
