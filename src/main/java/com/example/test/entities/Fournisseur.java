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
@Table(name = "Fournisseur")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idFournisseur ;
    private String codeFourniseur ;
    private String libelleFourniseur ;
    @Enumerated(EnumType.STRING)
    CategorieFournisseur categorieFournisseur ;

    @OneToMany(mappedBy = "fournisseur")
    private List<Facture> factureList;

    @OneToOne
    private DetailFournisseur detailFournisseur ;

    @ManyToMany
    private List<SecteurActivite> secteurActiviteList ;
}
