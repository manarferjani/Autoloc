package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ReservationRepository;
import tn.esprit.autoloc.Entites.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservation {

    private final ReservationRepository ReservationRepository;

    @Override
    public Reservation updateReservation(Reservation Reservation) {
        return ReservationRepository.save(Reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        ReservationRepository.deleteById(id);
    }

    @Override
    public Reservation addReservation(Reservation Reservation) {
        return ReservationRepository.save(Reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return ReservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        return ReservationRepository.findById(id).get();
    }
}