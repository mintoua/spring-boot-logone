package logone.digitale.gestionstock.services;

import logone.digitale.gestionstock.entities.Facture;
import logone.digitale.gestionstock.entities.Stock;
import logone.digitale.gestionstock.repositories.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StockService {

    private final StockRepository stockRepository;

    public Stock enregistrer(Stock stock){
        return stockRepository.save(stock);
    }

    //ReadAll
    public List<Stock> recupererTous(){
        return stockRepository.findAll();
    }

    //update
    public Stock modifier(Stock stock){
        return stockRepository.save(stock);
    }

    //Delete
    public void supprimerById(Long id){
        stockRepository.deleteById(id);
    }
}
