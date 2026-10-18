package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entites.Equipement;
import tn.esprit.autoloc.services.IEquipement;

import java.util.List;

@RestController
@RequestMapping("/api/Equipements")
public class EquipementController {

    private final IEquipement EquipementService;

    public EquipementController(IEquipement iEquipement) {
        EquipementService = iEquipement;
    }

    @PostMapping
    public Equipement addEquipement(@RequestBody Equipement Equipement) {
        return EquipementService.addEquipement(Equipement);
    }

    @PutMapping
    public Equipement updateEquipement(@RequestBody Equipement Equipement) {
        return EquipementService.updateEquipement(Equipement);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        EquipementService.deleteEquipement(id);
    }

    @GetMapping
    public List<Equipement> getAllEquipements() {
        return EquipementService.getAllEquipements();
    }

    @GetMapping("/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return EquipementService.getEquipementById(id);
    }
}