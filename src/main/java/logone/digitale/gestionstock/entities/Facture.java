package logone.digitale.gestionstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "tb_facture")
public class Facture implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO : JPA ASSOCIATION
    @OneToOne(mappedBy = "facture")
    @JsonIgnore
    private Commande commande;

    @Column(name = "montant-total")
    private Double total;

}
