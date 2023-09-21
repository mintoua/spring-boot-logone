package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "tb_commande")
public class Commande implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date-commande")
    private Instant date;

    //TODO : JPA ASSOCIATION
    @ManyToOne
    private Client client;

    @OneToOne
    private Facture facture;

    @OneToMany(mappedBy = "commande")
    private List<DetailCommande> detailCommandes;

}
