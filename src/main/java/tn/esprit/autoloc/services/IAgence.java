package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Agence;

import java.util.List;

public interface IAgence {

    Agence updateAgence(Agence agence);

    void deleteAgence(Long id);

    Agence addAgence(Agence agence);

    List<Agence> getAllAgences();

    Agence getAgenceById(Long id);
}