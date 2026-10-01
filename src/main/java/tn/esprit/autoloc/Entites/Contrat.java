package tn.esprit.autoloc.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    @Column(nullable = false, length = 20)
    LocalDate dateSignature;

    @Column(nullable = false, length = 20)
    BigDecimal montantTotal;

    @Column(nullable = false, length = 20)
    Boolean valide;
}
