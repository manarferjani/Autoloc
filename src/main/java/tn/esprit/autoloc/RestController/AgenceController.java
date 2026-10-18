package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entites.Agence;
import tn.esprit.autoloc.services.IAgence;

import java.util.List;

@RestController
@RequestMapping("/api/agences")
public class AgenceController {

    private final IAgence agenceService;

    public AgenceController(IAgence iAgence) {
        agenceService = iAgence;
    }

    @PostMapping
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @PutMapping
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @DeleteMapping("/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }

    @GetMapping
    public List<Agence> getAllClients() {
        return agenceService.getAllAgences();
    }

    @GetMapping("/{id}")
    public Agence getClientById(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }
}