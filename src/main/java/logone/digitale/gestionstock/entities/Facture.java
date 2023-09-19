package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_facture")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO : JPA ASSOCIATION
   // private Commande commande;

    @Column(name = "montant-total")
    private Double total;

}
