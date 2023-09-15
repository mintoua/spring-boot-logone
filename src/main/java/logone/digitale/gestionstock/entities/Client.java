package logone.digitale.gestionstock.entities;

import jakarta.persistence.*;
import logone.digitale.gestionstock.models.CategorieClient;

@Entity
@Table(name= "tb_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column(name = "nom-client")
    private String nom;

    @Column(name = "prenom-client")
    private String prenom;

    @Column(name = "email-client")
    private String email;

    @Column(name = "categorie-client")
    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient;

    public Client() {
    }

    public Client(Long idClient, String nom, String prenom, String email, CategorieClient categorieClient) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.categorieClient = categorieClient;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CategorieClient getCategorieClient() {
        return categorieClient;
    }

    public void setCategorieClient(CategorieClient categorieClient) {
        this.categorieClient = categorieClient;
    }
}
