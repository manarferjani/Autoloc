package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Entites.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
