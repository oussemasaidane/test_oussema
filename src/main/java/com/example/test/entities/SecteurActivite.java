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
@Table(name = "SecteurActivite")
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idSecteurActivite ;
    private String codeSecteurActivite ;
    private String libelleSecteurActivite ;

    @ManyToMany(mappedBy = "secteurActiviteList")
    private List<Fournisseur> fournisseurListActivite ;
}
