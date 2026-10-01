package tn.esprit.autoloc.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Maintenance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;

    @Column(nullable = false, length = 20)
    LocalDate dateDebut;

    @Column(nullable = false, length = 20)
    LocalDate dateFin;

    @Column(nullable = false, length = 20)
    String description;


}
