package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;

@Entity // pour rendre la classe persistante
@Table(name = "tb_produit") // pour spécifier le nom de notre table au niveau de la bd
public class Produit {
    @Id // pour spécifier la clé primaire de notre table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // TODO : Après
  //  @Column(name = "id")
    private Long idProduit;

    @Column(name = "code-produit") // pour spécifier le nom de la colonne au niveau de la table en bd
    private String codeProduit;

    @Column(name = "libelle-produit")
    private String libelleProduit;

    @Column(name = "prix-unitaire")
    private Double prixUnitaire;

    public Produit(Long idProduit, String codeProduit, String libelleProduit, Double prixUnitaire) {
        this.idProduit = idProduit;
        this.codeProduit = codeProduit;
        this.libelleProduit = libelleProduit;
        this.prixUnitaire = prixUnitaire;
    }

    public Produit() {

    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
