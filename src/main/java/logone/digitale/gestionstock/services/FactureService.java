package logone.digitale.gestionstock.services;


import logone.digitale.gestionstock.entities.Facture;
import logone.digitale.gestionstock.repositories.FactureRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FactureService {

    private final FactureRepo factureRepo;

    public Facture enregistrer(Facture facture){
        return factureRepo.save(facture);
    }

    //ReadAll
    public List<Facture> recupererTous(){
        return factureRepo.findAll();
    }

    //update
    public Facture modifier(Facture facture){
        return factureRepo.save(facture);
    }

    //Delete
    public void supprimerById(Long id){
        factureRepo.deleteById(id);
    }
}
