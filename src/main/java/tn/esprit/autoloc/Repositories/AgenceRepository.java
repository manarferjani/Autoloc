package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Entites.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
