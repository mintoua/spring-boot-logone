package logone.digitale.gestionstock.controllers;

import logone.digitale.gestionstock.entities.Commande;
import logone.digitale.gestionstock.services.CommandeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/commandes")
public class CommandeController {

    private final CommandeService commandeService;

    //Methode HTTP GET
    //URL: http://localhost:8089/api/commandes/
    @GetMapping("")
    public ResponseEntity<List<Commande>> getAll(){
        List<Commande> commandes = commandeService.recupererTous();
        return ResponseEntity.ok(commandes);
    }

    //Methode HTTP POST
    //URL:  http://localhost:8089/api/commandes/add
    @PostMapping("/add")
    public ResponseEntity<Commande> add(@RequestBody Commande commande){
        Commande commandeAjoute = commandeService.enregistrer(commande);
        return ResponseEntity.status(HttpStatus.CREATED).body(commandeAjoute);
    }

    //Methode HTTP DELETE
    //URL:  http://localhost:8089/api/commandes/delete/3
    @DeleteMapping("/delete/{idP}")
    public ResponseEntity<String> delete(@PathVariable("idP") Long id){
        commandeService.supprimerParId(id);
        //return ResponseEntity.ok("Deleted Sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfuly");
    }

    //Methode HTTP PUT
    //URL:http://localhost:8089/api/commandes/update
    @PutMapping("/update")
    public ResponseEntity<Commande> update(@RequestBody Commande commande){
        Commande commandeModifie = commandeService.modifier(commande);
        return ResponseEntity.status(HttpStatus.CREATED).body(commandeModifie);
    }

}
