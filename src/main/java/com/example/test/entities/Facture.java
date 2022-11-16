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
@Table(name ="Facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idFacture;
    private float montantRemise ;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    private Date dateDerniereModification ;
    private boolean archivee ;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures ;

    @OneToMany(mappedBy = "facture")
    private List<Reglement> reglementList ;

    @ManyToOne
    private Fournisseur fournisseur ;

}
