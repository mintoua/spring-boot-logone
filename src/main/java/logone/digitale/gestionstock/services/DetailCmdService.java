package logone.digitale.gestionstock.services;

import logone.digitale.gestionstock.entities.Commande;
import logone.digitale.gestionstock.entities.DetailCommande;
import logone.digitale.gestionstock.repositories.DetailCmdRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DetailCmdService {

    private final DetailCmdRepo detailCmdRepo;

    //Create
    public DetailCommande enregistrer(DetailCommande detailCommande){
        return detailCmdRepo.save(detailCommande);
    }

    //ReadAll
    public List<DetailCommande> recupererTous(){
        return detailCmdRepo.findAll();
    }

    //ReadById
    public DetailCommande trouverParId(Long id){
        return detailCmdRepo.findById(id).orElse(null);
    }

    //Update
    public DetailCommande modifier(DetailCommande commande) {

        return detailCmdRepo.save(commande);
    }

    //Delete
    public void supprimerParId(Long id) {
        detailCmdRepo.deleteById(id); // delete from tb_detail-commande where id=:?
    }
}
