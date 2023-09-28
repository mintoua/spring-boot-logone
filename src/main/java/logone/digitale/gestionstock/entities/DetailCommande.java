package logone.digitale.gestionstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Entity
@Table(name= "tb_detailCommande")
public class DetailCommande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO : JPA ASSOCIATION
    @ManyToOne
    @JsonIgnore
    private Commande commande;

    //TODO : JPA ASSOCIATION
    @OneToMany(mappedBy = "detailCommande")
    @JsonIgnore
    private List<Produit> produits;

    @Column(name = "quantite-produit")
    private Integer quantite;

    @Column(name = "prix-unitaire")
    private Double prixUnitaire;
}
