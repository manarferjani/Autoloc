package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Entites.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
