package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EmployeRepository;
import tn.esprit.autoloc.Entites.Employe;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmploye {

    private final EmployeRepository EmployeRepository;

    @Override
    public Employe updateEmploye(Employe Employe) {
        return EmployeRepository.save(Employe);
    }

    @Override
    public void deleteEmploye(Long id) {
        EmployeRepository.deleteById(id);
    }

    @Override
    public Employe addEmploye(Employe Employe) {
        return EmployeRepository.save(Employe);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return EmployeRepository.findAll();
    }

    @Override
    public Employe getEmployeById(Long id) {
        return EmployeRepository.findById(id).get();
    }
}