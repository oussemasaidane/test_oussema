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
@Table(name = "CategorieProduit")
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idCategorieProduit ;
    private String codeProduit ;
    private String libelleCategorieProduit ;

    @OneToMany(mappedBy = "categorieProduit")
    private List<Produit> categorieProduit ;
}
