package tn.esprit.autoloc.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Paiement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;

    @Column(nullable = false, length = 20)
    BigDecimal montant;

    @Column(nullable = false, length = 20)
    LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    ModePaiement modePaiement;


}
