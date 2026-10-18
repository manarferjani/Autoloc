package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entites.Maintenance;
import tn.esprit.autoloc.services.IMaintenance;

import java.util.List;

@RestController
@RequestMapping("/api/Maintenances")
public class MaintenanceController {

    private final IMaintenance maintenanceService;

    public MaintenanceController(IMaintenance iMaintenance) {
        maintenanceService = iMaintenance;
    }

    @PostMapping
    public Maintenance addMaintenance(@RequestBody Maintenance Maintenance) {
        return maintenanceService.addMaintenance(Maintenance);
    }

    @PutMapping
    public Maintenance updateMaintenance(@RequestBody Maintenance Maintenance) {
        return maintenanceService.updateMaintenance(Maintenance);
    }

    @DeleteMapping("/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

    @GetMapping("/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }
}