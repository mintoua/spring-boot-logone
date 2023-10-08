package logone.digitale.gestionstock.repositories;

import logone.digitale.gestionstock.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepo extends JpaRepository<Facture,Long> {
}
