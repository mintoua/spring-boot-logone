package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_stock")
public class Stock {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //TODO: JPA ASSOCIATION
    //private Produit produit;


    @Column(name = "quantite-produit")
    private Integer quantite;
}
