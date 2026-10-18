package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.MaintenanceRepository;
import tn.esprit.autoloc.Entites.Maintenance;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements IMaintenance {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance updateMaintenance(Maintenance Maintenance) {
        return maintenanceRepository.save(Maintenance);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public Maintenance addMaintenance(Maintenance Maintenance) {
        return maintenanceRepository.save(Maintenance);
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance getMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).get();
    }
}