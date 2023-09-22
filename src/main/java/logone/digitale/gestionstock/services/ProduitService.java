package logone.digitale.gestionstock.services;

import jakarta.annotation.PostConstruct;
import logone.digitale.gestionstock.entities.Produit;
import logone.digitale.gestionstock.repositories.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ProduitService {

    private ProduitRepository produitRepository;

    //Create
    public Produit enregistrerProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    //ReadById
    public Produit trouverProduitParId(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    //ReadAll
    public List<Produit> listerTousLesProduits() {
        return produitRepository.findAll();
    }

    //Update
    public Produit modifierProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    //Delete
    public void supprimerProduit(Long id) {
        produitRepository.deleteById(id);
    }

    @PostConstruct
    public void initialiserProduit() {
        Produit nouveauProduit = new Produit();
        nouveauProduit.setCodeProduit("PROD001");
        nouveauProduit.setLibelleProduit("Exemple de produit");
        nouveauProduit.setPrixUnitaire(19.99);

        // Vous pouvez également initialiser d'autres propriétés et associations ici.
        // Par exemple, si vous avez une association vers DetailCommande, Stock, et Fournisseur.

        // Initialisation de la liste des fournisseurs (exemple avec une liste vide).
        nouveauProduit.setFounisseurs(new ArrayList<>());

        // Enregistrement du produit dans la base de données.
        enregistrerProduit(nouveauProduit);
    }
}
