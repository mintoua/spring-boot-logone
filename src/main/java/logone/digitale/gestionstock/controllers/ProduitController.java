package logone.digitale.gestionstock.controllers;

import logone.digitale.gestionstock.entities.Produit;
import logone.digitale.gestionstock.services.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/produits")
public class ProduitController {

    final private ProduitService produitService;

    //Get
    //URL: http://localhost:8089/api/produits
    @GetMapping("")
    public ResponseEntity<List<Produit>> getAllProduits(){
        List<Produit> produits = produitService.listerTousLesProduits();
        return ResponseEntity.ok(produits);
    }

}
