package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Maintenance;


import java.util.List;

public interface IMaintenance {

    Maintenance updateMaintenance(Maintenance Maintenance);

    void deleteMaintenance(Long id);

    Maintenance addMaintenance(Maintenance Maintenance);

    List<Maintenance> getAllMaintenances();

    Maintenance getMaintenanceById(Long id);
}