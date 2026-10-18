package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ContratRepository;
import tn.esprit.autoloc.Entites.Contrat;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContrat {

    private final ContratRepository ContratRepository;

    @Override
    public Contrat updateContrat(Contrat Contrat) {
        return ContratRepository.save(Contrat);
    }

    @Override
    public void deleteContrat(Long id) {
        ContratRepository.deleteById(id);
    }

    @Override
    public Contrat addContrat(Contrat Contrat) {
        return ContratRepository.save(Contrat);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return ContratRepository.findAll();
    }

    @Override
    public Contrat getContratById(Long id) {
        return ContratRepository.findById(id).get();
    }
}