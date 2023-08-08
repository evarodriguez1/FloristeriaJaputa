package com.floristeria.FloristeriaJaputa.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "trees")
public class Tree implements ProductInterface {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(name = "heigth")
    private int heigth;

    @Getter @Setter
    @Column(name = "price")
    private double price;

    // Constructores
    public Tree(){

    }

    public Tree(int heigth, double price){
        this.heigth = heigth;
        this.price = price;
    }

}
