package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Entites.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
