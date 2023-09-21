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
@Entity
@Table(name= "tb_fournisseur")
public class Fournisseur implements Serializable {
    private static final long serialVersionUID = 1L;

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
