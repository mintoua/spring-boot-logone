package logone.digitale.gestionstock.services;

import logone.digitale.gestionstock.entities.Fournisseur;
import logone.digitale.gestionstock.repositories.FournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FournisseurService {

    final private FournisseurRepository fournisseurRepository;

    public Fournisseur enregistrer(Fournisseur fournisseur){
        return fournisseurRepository.save(fournisseur);
    }

    //ReadAll
    public List<Fournisseur> recupererTous(){
        return fournisseurRepository.findAll();
    }

    //update
    public Fournisseur modifier(Fournisseur fournisseur){
        return fournisseurRepository.save(fournisseur);
    }

    //Delete
    public void supprimerById(Long id){
        fournisseurRepository.deleteById(id);
    }
}
