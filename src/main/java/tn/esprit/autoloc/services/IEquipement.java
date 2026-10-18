package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Equipement;

import java.util.List;

public interface IEquipement {

    Equipement updateEquipement(Equipement Equipement);

    void deleteEquipement(Long id);

    Equipement addEquipement(Equipement Equipement);

    List<Equipement> getAllEquipements();

    Equipement getEquipementById(Long id);
}