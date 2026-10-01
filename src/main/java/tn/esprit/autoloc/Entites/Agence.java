package tn.esprit.autoloc.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgence;

    @Column(nullable = false, unique = true, length = 20)
    String nom;

    @Column(nullable = false, length = 50)
    String ville;

    @Column(nullable = false, length = 50)
    String adresse;

    @Column(nullable = false, length = 50)
    String telephone;

}