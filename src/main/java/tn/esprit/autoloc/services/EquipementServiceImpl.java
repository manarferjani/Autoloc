package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EquipementRepository;
import tn.esprit.autoloc.Entites.Equipement;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementServiceImpl implements IEquipement {

    private final EquipementRepository EquipementRepository;

    @Override
    public Equipement updateEquipement(Equipement Equipement) {
        return EquipementRepository.save(Equipement);
    }

    @Override
    public void deleteEquipement(Long id) {
        EquipementRepository.deleteById(id);
    }

    @Override
    public Equipement addEquipement(Equipement Equipement) {
        return EquipementRepository.save(Equipement);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return EquipementRepository.findAll();
    }

    @Override
    public Equipement getEquipementById(Long id) {
        return EquipementRepository.findById(id).get();
    }
}