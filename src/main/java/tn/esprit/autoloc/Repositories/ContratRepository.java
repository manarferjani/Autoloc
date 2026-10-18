package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Entites.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
