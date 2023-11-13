package logone.digitale.gestionstock.controllers;

import logone.digitale.gestionstock.entities.Facture;
import logone.digitale.gestionstock.services.FactureService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/factures")
public class FactureController {

    private final FactureService factureService;

    //Methode HTTP GET
    //URL: http://localhost:8089/api/factures
    @GetMapping("")
    public ResponseEntity<List<Facture>> getAll(){
        List<Facture> factures = factureService.recupererTous();
        return ResponseEntity.ok(factures);
    }

    //Methode HTTP POST
    //URL:  http://localhost:8089/api/factures/add
    @PostMapping("/add")
    public ResponseEntity<Facture> add(@RequestBody Facture facture){
        Facture factureAjoute = factureService.enregistrer(facture);
        return ResponseEntity.status(HttpStatus.CREATED).body(factureAjoute);
    }

    //Methode HTTP DELETE
    //URL:  http://localhost:8089/api/factures/delete/3
    @DeleteMapping("/delete/{idP}")
    public ResponseEntity<String> delete(@PathVariable("idP") Long id){
        factureService.supprimerById(id);
        //return ResponseEntity.ok("Deleted Sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfuly");
    }

    //Methode HTTP PUT
    //URL:http://localhost:8089/api/factures/update
    @PutMapping("/update")
    public ResponseEntity<Facture> update(@RequestBody Facture facture){
        Facture factureModifie = factureService.modifier(facture);
        return ResponseEntity.status(HttpStatus.CREATED).body(factureModifie);
    }

}
