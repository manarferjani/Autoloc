package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Entites.Employe;

import java.util.List;

public interface IEmploye {

    Employe updateEmploye(Employe Employe);

    void deleteEmploye(Long id);

    Employe addEmploye(Employe Employe);

    List<Employe> getAllEmployes();

    Employe getEmployeById(Long id);
}