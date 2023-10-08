package logone.digitale.gestionstock.controllers;

import logone.digitale.gestionstock.entities.Commande;
import logone.digitale.gestionstock.entities.DetailCommande;
import logone.digitale.gestionstock.services.DetailCmdService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/detail-commandes")
public class DetailCmdController {
    private final DetailCmdService detailCmdService;
    //Methode HTTP GET
    //URL: http://localhost:8089/api/detail-commandes/
    @GetMapping("")
    public ResponseEntity<List<DetailCommande>> getAll(){
        List<DetailCommande> detailCommandes = detailCmdService.recupererTous();
        return ResponseEntity.ok(detailCommandes);
    }

    //Methode HTTP POST
    //URL:  http://localhost:8089/api/detail-commandes/add
    @PostMapping("/add")
    public ResponseEntity<DetailCommande> add(@RequestBody DetailCommande detailCommande){
        DetailCommande commandeAjoute = detailCmdService.enregistrer(commande);
        return ResponseEntity.status(HttpStatus.CREATED).body(commandeAjoute);
    }

    //Methode HTTP DELETE
    //URL:  http://localhost:8089/api/detail-commandes/delete/3
    @DeleteMapping("/delete/{idP}")
    public ResponseEntity<String> delete(@PathVariable("idP") Long id){
        commandeService.supprimerParId(id);
        //return ResponseEntity.ok("Deleted Sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfuly");
    }

    //Methode HTTP PUT
    //URL:http://localhost:8089/api/detail-commandes/update
    @PutMapping("/update")
    public ResponseEntity<DetailCommande> update(@RequestBody DetailCommande commande){
        DetailCommande commandeAjoute = detailCmdService.modifier(commande);
        return ResponseEntity.status(HttpStatus.CREATED).body(commandeAjoute);
    }
}
