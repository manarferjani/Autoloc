package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Entites.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
