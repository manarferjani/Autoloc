package tn.esprit.autoloc.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;

    @Column(nullable = false, length = 20)
    String nom;

    @Column(nullable = false, length = 50)
    String prenom;

    @Column(nullable = false, length = 50)
    String email;

    @Column(nullable = false, length = 50)
    String telephone;

    @Column(nullable = false, length = 50)
    String numPermis;

    @Column(nullable = false, length = 50)
    String dateInscription;

}