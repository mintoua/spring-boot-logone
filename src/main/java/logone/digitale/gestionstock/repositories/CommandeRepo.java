package logone.digitale.gestionstock.repositories;

import logone.digitale.gestionstock.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepo extends JpaRepository<Commande,Long> {
}
