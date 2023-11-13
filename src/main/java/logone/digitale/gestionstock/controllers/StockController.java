package logone.digitale.gestionstock.controllers;

import logone.digitale.gestionstock.entities.Stock;
import logone.digitale.gestionstock.services.StockService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/stocks")
public class StockController {

    final private StockService stockService;

    //Methode HTTP GET
    //URL: http://localhost:8089/api/stocks
    @GetMapping("")
    public ResponseEntity<List<Stock>> getAll(){
        List<Stock> stocks = stockService.recupererTous();
        return ResponseEntity.ok(stocks);
    }

    //Methode HTTP POST
    //URL:  http://localhost:8089/api/stocks/add
    @PostMapping("/add")
    public ResponseEntity<Stock> add(@RequestBody Stock stock){
        Stock stockAjoute = stockService.enregistrer(stock);
        return ResponseEntity.status(HttpStatus.CREATED).body(stockAjoute);
    }

    //Methode HTTP DELETE
    //URL:  http://localhost:8089/api/stocks/delete/3
    @DeleteMapping("/delete/{idP}")
    public ResponseEntity<String> delete(@PathVariable("idP") Long id){
        stockService.supprimerById(id);
        //return ResponseEntity.ok("Deleted Sucessfully");
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfuly");
    }

    //Methode HTTP PUT
    //URL:http://localhost:8089/api/stocks/update
    @PutMapping("/update")
    public ResponseEntity<Stock> update(@RequestBody Stock stock){
        Stock stockModifie = stockService.modifier(stock);
        return ResponseEntity.status(HttpStatus.CREATED).body(stockModifie);
    }
}
