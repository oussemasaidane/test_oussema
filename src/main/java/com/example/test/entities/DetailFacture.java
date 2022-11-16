package com.example.test.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="DetailFacture")

public class DetailFacture {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id")
    private long idDetailFacture;
    private int qteCommandee ;
    private float prixTotalDetail ;
    private int pourcentageRemise ;
    private float montantRemise ;

    @ManyToOne
    private Facture facture ;

    @ManyToOne
    private Produit produit ;

}
