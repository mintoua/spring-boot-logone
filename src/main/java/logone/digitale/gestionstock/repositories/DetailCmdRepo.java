package logone.digitale.gestionstock.repositories;

import logone.digitale.gestionstock.entities.DetailCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailCmdRepo extends JpaRepository<DetailCommande, Long> {
}
