package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_fournisseur")
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom-fournisseur")
    private String nom;

    @Column(name="adresse-fournisseur")
    private String adresse;

    @Column(name="telephone-fournisseur")
    private String telephone;


}
