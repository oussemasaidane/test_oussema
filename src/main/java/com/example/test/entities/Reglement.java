package com.example.test.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Reglement")
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idReglement ;
    private float montantPaye ;
    private  float montantRestant ;
    private boolean payee ;
    @Temporal(TemporalType.DATE)
    private  Date dateReglement ;

    @ManyToOne
     Facture facture ;

}
