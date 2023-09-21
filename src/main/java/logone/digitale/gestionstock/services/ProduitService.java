package logone.digitale.gestionstock.services;

import logone.digitale.gestionstock.entities.Produit;
import logone.digitale.gestionstock.repositories.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
