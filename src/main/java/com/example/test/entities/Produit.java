package com.example.test.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idProduit ;
    private String codeProduit ;
    private String libelleProduit ;
    private float prix ;
    @Temporal(TemporalType.DATE)
    private Date dateCreation ;
    private  Date dateDerniereModification ;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures ;

    @ManyToOne
    private Stock stock ;

    @ManyToOne
    private CategorieProduit categorieProduit ;
}
