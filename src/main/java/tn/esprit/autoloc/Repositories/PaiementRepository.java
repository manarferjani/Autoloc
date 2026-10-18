package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Entites.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
