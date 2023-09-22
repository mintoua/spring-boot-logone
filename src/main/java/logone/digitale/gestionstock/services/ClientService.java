package logone.digitale.gestionstock.services;


import jakarta.annotation.PostConstruct;
import logone.digitale.gestionstock.entities.Client;
import logone.digitale.gestionstock.entities.Produit;
import logone.digitale.gestionstock.models.CategorieClient;
import logone.digitale.gestionstock.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class ClientService {

    //Pour faire l'injection de dépendance de ClientRepository
    //1- Créer un attribut de type ClientRepository
    final private ClientRepository clientRepository;
    //2- Générer le constructeur parametré de ClientService // alternative @AllArgsConstructor
    //--fin de l'injection de la dépendance ClienRepository


    //CRUD
    //Create
    public Client enregistrerClient(Client client){
        return clientRepository.save(client);
    }


    @PostConstruct
    public void initialiserClient() {
        //créer un objet client
        Client nouveauClient = new Client();
        nouveauClient.setNom("Mta");
        nouveauClient.setPrenom("Tpkd");
        nouveauClient.setEmail("mta@gmail.com");
        nouveauClient.setCategorieClient(CategorieClient.ORDINAIRE);
        // Initialisation de la liste des commandes (exemple avec une liste vide).
        nouveauClient.setCommandes(new ArrayList<>());

        // Enregistrement du produit dans la base de données.
        enregistrerClient(nouveauClient);
    }

}
