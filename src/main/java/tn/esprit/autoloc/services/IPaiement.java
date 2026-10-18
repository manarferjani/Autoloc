package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Paiement;

import java.util.List;

public interface IPaiement {

    Paiement updatePaiement(Paiement Paiement);

    void deletePaiement(Long id);

    Paiement addPaiement(Paiement Paiement);

    List<Paiement> getAllPaiements();

    Paiement getPaiementById(Long id);
}