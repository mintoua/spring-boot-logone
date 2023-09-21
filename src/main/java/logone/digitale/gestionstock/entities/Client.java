package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;
import logone.digitale.gestionstock.models.CategorieClient;
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
@Table(name= "tb_client")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom-client")
    private String nom;

    @Column(name = "prenom-client")
    private String prenom;

    @Column(name = "email-client")
    private String email;

    @Column(name = "categorie-client")
    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient;

    //TODO : JPA ASSOCIATION
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;
}
