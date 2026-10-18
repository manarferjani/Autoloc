package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entites.Paiement;
import tn.esprit.autoloc.services.IPaiement;

import java.util.List;

@RestController
@RequestMapping("/api/Paiements")
public class PaiementController {

    private final IPaiement PaiementService;

    public PaiementController(IPaiement iPaiement) {
        PaiementService = iPaiement;
    }

    @PostMapping
    public Paiement addPaiement(@RequestBody Paiement Paiement) {
        return PaiementService.addPaiement(Paiement);
    }

    @PutMapping
    public Paiement updatePaiement(@RequestBody Paiement Paiement) {
        return PaiementService.updatePaiement(Paiement);
    }

    @DeleteMapping("/{id}")
    public void deletePaiement(@PathVariable Long id) {
        PaiementService.deletePaiement(id);
    }

    @GetMapping
    public List<Paiement> getAllPaiements() {
        return PaiementService.getAllPaiements();
    }

    @GetMapping("/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return PaiementService.getPaiementById(id);
    }
}