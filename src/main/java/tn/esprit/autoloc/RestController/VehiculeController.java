package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entites.Vehicule;
import tn.esprit.autoloc.services.IVehicule;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
public class VehiculeController {

    private final IVehicule vehiculeService;

    public VehiculeController(IVehicule iVehicule) {
        vehiculeService = iVehicule;
    }

    @PostMapping
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }

    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }
}