package logone.digitale.gestionstock.controllers;

import logone.digitale.gestionstock.entities.Produit;
import logone.digitale.gestionstock.services.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/produits")
public class ProduitController {

    final private ProduitService produitService;

    //Methode HTTP GET
    //URL:  http://localhost:8089/api/produits/
    @GetMapping("")
    public ResponseEntity<List<Produit>> getAllProduits(){
        List<Produit> produits = produitService.listerTousLesProduits();
        return ResponseEntity.ok(produits);
    }

    //Methode HTTP POST
    //URL:  http://localhost:8089/api/produits/add
    @PostMapping("/add")
    public ResponseEntity<Produit> addProduit(@RequestBody Produit produit){
        Produit produitAjoute = produitService.enregistrerProduit(produit);
        return ResponseEntity.status(HttpStatus.CREATED).body(produitAjoute);
    }

    //Methode HTTP DELETE
    //URL:  http://localhost:8089/api/produits/delete/3
    @DeleteMapping("/delete/{idP}")
    public ResponseEntity<String> deleteProduit(@PathVariable("idP") Long id){
        produitService.supprimerProduit(id);
        //return ResponseEntity.ok("Deleted Sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfuly");
    }

    //Methode HTTP PUT
    //URL:http://localhost:8089/api/produits/update
    @PutMapping("/update")
    public ResponseEntity<Produit> updateProduit(@RequestBody Produit produit){
        Produit produitModifie = produitService.modifierProduit(produit);
        return ResponseEntity.status(HttpStatus.CREATED).body(produitModifie);
    }
}
