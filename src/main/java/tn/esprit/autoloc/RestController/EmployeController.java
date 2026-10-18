package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Entites.Employe;
import tn.esprit.autoloc.services.IEmploye;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
public class EmployeController {

    private final IEmploye employeService;

    public EmployeController(IEmploye iEmploye) {
        employeService = iEmploye;
    }

    @PostMapping
    public Employe addEmploye(@RequestBody Employe Employe) {
        return employeService.addEmploye(Employe);
    }

    @PutMapping
    public Employe updateEmploye(@RequestBody Employe Employe) {
        return employeService.updateEmploye(Employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

    @GetMapping
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }
}