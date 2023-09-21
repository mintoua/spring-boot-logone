package logone.digitale.gestionstock.repositories;

import logone.digitale.gestionstock.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
