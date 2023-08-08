
package com.floristeria.FloristeriaJaputa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    @Getter @Setter
    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private List<Product> products;

    @Getter @Setter
    @Column(name = "total")
    private double total;

    // Constructor sin parámetros (obligatorio para JPA)
    public Ticket() {
        this.purchaseDate = LocalDateTime.now();
        this.products = new ArrayList<>();
    }

    // Constructor con parámetros para inicializar la lista de productos
    public Ticket(List<Product> products) {
        this.purchaseDate = LocalDateTime.now();
        this.products = products;
    }

}


