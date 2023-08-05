package com.floristeria.FloristeriaJaputa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "decorations")

public class Decoration {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(name = "material")
    private String material;

    @Getter @Setter
    @Column(name = "price")
    private double price;

    // Constructores
    public Decoration(){

    }

    public Decoration(String material, double price){
        this.material = material;
        this.price = price;
    }
}