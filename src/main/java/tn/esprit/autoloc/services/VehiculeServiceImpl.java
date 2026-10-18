package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.VehiculeRepository;
import tn.esprit.autoloc.Entites.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehicule {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).get();
    }
}