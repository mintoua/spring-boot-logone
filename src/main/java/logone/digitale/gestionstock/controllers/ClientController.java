package logone.digitale.gestionstock.controllers;

import logone.digitale.gestionstock.entities.Client;
import logone.digitale.gestionstock.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/clients")
public class ClientController {

    final  private ClientService clientService;

    //Methode HTTP GET
    //URL: http://localhost:8089/api/clients
    @GetMapping("")
    public ResponseEntity<List<Client>> getAll(){
        List<Client> clients = clientService.recupererTous();
        return ResponseEntity.ok(clients);
    }

    //Methode HTTP POST
    //URL:  http://localhost:8089/api/clients/add
    @PostMapping("/add")
    public ResponseEntity<Client> add(@RequestBody Client client){
        Client clientAjoute = clientService.enregistrer(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientAjoute);
    }

    //Methode HTTP DELETE
    //URL:  http://localhost:8089/api/clients/delete/3
    @DeleteMapping("/delete/{idP}")
    public ResponseEntity<String> delete(@PathVariable("idP") Long id){
        clientService.supprimerParId(id);
        //return ResponseEntity.ok("Deleted Sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfuly");
    }

    //Methode HTTP PUT
    //URL:http://localhost:8089/api/clients/update
    @PutMapping("/update")
    public ResponseEntity<Client> update(@RequestBody Client client){
        Client clientModifie = clientService.modifier(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientModifie);
    }
}
