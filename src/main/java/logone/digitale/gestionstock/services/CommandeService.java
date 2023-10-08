package logone.digitale.gestionstock.services;

import logone.digitale.gestionstock.entities.Commande;
import logone.digitale.gestionstock.entities.Produit;
import logone.digitale.gestionstock.repositories.CommandeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CommandeService {

    private final CommandeRepo commandeRepo;

    //Create
    public Commande enregistrer(Commande commande){
        return commandeRepo.save(commande);
    }

    //ReadAll
    public List<Commande> recupererTous(){
        return commandeRepo.findAll();
    }

    //ReadById
    public Commande trouverParId(Long id){
        return commandeRepo.findById(id).orElse(null);
    }

    //Update
    public Commande modifier(Commande commande) {

        return commandeRepo.save(commande);
    }

    //Delete
    public void supprimerParId(Long id) {
        commandeRepo.deleteById(id); // delete from tb_commande where id=:?
    }
}
