package logone.digitale.gestionstock.services;


import jakarta.annotation.PostConstruct;
import logone.digitale.gestionstock.entities.Client;
import logone.digitale.gestionstock.entities.Produit;
import logone.digitale.gestionstock.models.CategorieClient;
import logone.digitale.gestionstock.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public Client enregistrer(Client client){
        return clientRepository.save(client);
    }

    //ReadAll
    public List<Client> recupererTous(){
        return clientRepository.findAll();
    }

    //update
    public Client modifier(Client client){
        return clientRepository.save(client);
    }

    //Delete
    public void supprimerParId(Long id){
        clientRepository.deleteById(id);
    }
}
