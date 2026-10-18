package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entites.Contrat;
import tn.esprit.autoloc.services.IContrat;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
public class ContratController {

    private final IContrat contratService;

    public ContratController(IContrat iContrat) {
        contratService = iContrat;
    }

    @PostMapping
    public Contrat addContrat(@RequestBody Contrat Contrat) {
        return contratService.addContrat(Contrat);
    }

    @PutMapping
    public Contrat updateContrat(@RequestBody Contrat Contrat) {
        return contratService.updateContrat(Contrat);
    }

    @DeleteMapping("/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }

    @GetMapping
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }

    @GetMapping("/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }
}