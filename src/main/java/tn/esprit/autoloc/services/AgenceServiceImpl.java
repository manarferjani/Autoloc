package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.AgenceRepository;
import tn.esprit.autoloc.Entites.Agence;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgence {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence addAgence(Agence Agence) {
        return agenceRepository.save(Agence);
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence getAgenceById(Long id) {
        return agenceRepository.findById(id).get();
    }
}