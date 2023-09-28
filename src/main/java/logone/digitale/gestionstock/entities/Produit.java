package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity // pour rendre la classe persistante
@Table(name = "tb_produit") // pour spécifier le nom de notre table au niveau de la bd
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id // pour spécifier la clé primaire de notre table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // TODO : Après
  //  @Column(name = "id")
    private Long id;

    @Column(name = "code-produit") // pour spécifier le nom de la colonne au niveau de la table en bd
    private String codeProduit;

    @Column(name = "libelle-produit")
    private String libelleProduit;

    @Column(name = "prix-unitaire")
    private Double prixUnitaire;

    //TODO : JPA ASSOCIATION
    @ManyToOne
    private DetailCommande detailCommande;

    @ManyToOne
    private Stock stock;

    @ManyToMany
    private List<Fournisseur> founisseurs;
}
