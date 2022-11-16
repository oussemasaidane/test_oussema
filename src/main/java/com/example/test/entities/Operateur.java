package com.example.test.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Operateur")
public class Operateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idOperateur ;
    private String nom ;
    private String prenom ;
    private  String password ;

    @OneToMany
    private List<Facture> factureOperateur ;
}
