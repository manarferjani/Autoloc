package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Reservation;

import java.util.List;

public interface IReservation {

    Reservation updateReservation(Reservation Reservation);

    void deleteReservation(Long id);

    Reservation addReservation(Reservation Reservation);

    List<Reservation> getAllReservations();

    Reservation getReservationById(Long id);
}