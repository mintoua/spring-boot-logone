package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_detailCommande")
public class DetailCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO : JPA ASSOCIATION
    //private Commande commande;

    //TODO : JPA ASSOCIATION
    //private Produit produit;

    @Column(name = "quantite-produit")
    private Integer quantite;

    @Column(name = "prix-unitaire")
    private Double prixUnitaire;
}
