package logone.digitale.gestionstock.controllers;

import logone.digitale.gestionstock.entities.Client;
import logone.digitale.gestionstock.entities.Fournisseur;
import logone.digitale.gestionstock.services.FournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/fournisseurs")
public class FournisseurController {
    
    final private FournisseurService fournisseurService;

    //Methode HTTP GET
    //URL: http://localhost:8089/api/fournisseurs/
    @GetMapping("")
    public ResponseEntity<List<Fournisseur>> getAll(){
        List<Fournisseur> fournisseurs = fournisseurService.recupererTous();
        return ResponseEntity.ok(fournisseurs);
    }

    //Methode HTTP POST
    //URL:  http://localhost:8089/api/fournisseurs/add
    @PostMapping("/add")
    public ResponseEntity<Fournisseur> add(@RequestBody Fournisseur fournisseur){
        Fournisseur fournisseurAjoute = fournisseurService.enregistrer(fournisseur);
        return ResponseEntity.status(HttpStatus.CREATED).body(fournisseurAjoute);
    }

    //Methode HTTP DELETE
    //URL:  http://localhost:8089/api/fournisseurs/delete/3
    @DeleteMapping("/delete/{idP}")
    public ResponseEntity<String> delete(@PathVariable("idP") Long id){
        fournisseurService.supprimerById(id);
        //return ResponseEntity.ok("Deleted Sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfuly");
    }

    //Methode HTTP PUT
    //URL:http://localhost:8089/api/clients/update
    @PutMapping("/update")
    public ResponseEntity<Fournisseur> update(@RequestBody Fournisseur fournisseur){
        Fournisseur fournisseurModifie = fournisseurService.modifier(fournisseur);
        return ResponseEntity.status(HttpStatus.CREATED).body(fournisseurModifie);
    }
}
