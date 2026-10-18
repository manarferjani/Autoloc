package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entites.Reservation;
import tn.esprit.autoloc.services.IReservation;

import java.util.List;

@RestController
@RequestMapping("/api/Reservations")
public class ReservationController {

    private final IReservation ReservationService;

    public ReservationController(IReservation iReservation) {
        ReservationService = iReservation;
    }

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation Reservation) {
        return ReservationService.addReservation(Reservation);
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation Reservation) {
        return ReservationService.updateReservation(Reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        ReservationService.deleteReservation(id);
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return ReservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return ReservationService.getReservationById(id);
    }
}