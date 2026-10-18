package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Contrat;

import java.util.List;

public interface IContrat {

    Contrat updateContrat(Contrat Contrat);

    void deleteContrat(Long id);

    Contrat addContrat(Contrat Contrat);

    List<Contrat> getAllContrats();

    Contrat getContratById(Long id);
}