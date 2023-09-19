package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name= "tb_commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date-commande")
    private Instant date;

    //TODO : JPA ASSOCIATION
   // private Client client;
}
