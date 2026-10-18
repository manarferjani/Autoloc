package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.PaiementRepository;
import tn.esprit.autoloc.Entites.Paiement;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementServiceImpl implements IPaiement {

    private final PaiementRepository PaiementRepository;

    @Override
    public Paiement updatePaiement(Paiement Paiement) {
        return PaiementRepository.save(Paiement);
    }

    @Override
    public void deletePaiement(Long id) {
        PaiementRepository.deleteById(id);
    }

    @Override
    public Paiement addPaiement(Paiement Paiement) {
        return PaiementRepository.save(Paiement);
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return PaiementRepository.findAll();
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return PaiementRepository.findById(id).get();
    }
}