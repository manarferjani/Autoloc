package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Vehicule;

import java.util.List;

public interface IVehicule {

    Vehicule updateVehicule(Vehicule vehicule);

    void deleteVehicule(Long id);

    Vehicule addVehicule(Vehicule vehicule);

    List<Vehicule> getAllVehicules();

    Vehicule getVehiculeById(Long id);
}