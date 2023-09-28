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
        return produitRepository.save(produit); // insert into tb_produit values (?,?,?,?,?)
    }

    //ReadById
    public Produit trouverProduitParId(Long id) {
        return produitRepository.findById(id).orElse(null); // select from tb_produit where id:=?
    }

    //ReadAll
    public List<Produit> listerTousLesProduits() {
        //comment recuperer la liste de tous les produits
        return produitRepository.findAll(); // select *(all) from tb_produit
    }

    //Update
    public Produit modifierProduit(Produit produit) {

        return produitRepository.save(produit);
    }

    //Delete
    public void supprimerProduit(Long id) {
        produitRepository.deleteById(id); // delete from tb_produit where id=:?
    }

}
