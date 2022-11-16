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
@Table(name = "DetailFournisseur")
public class DetailFournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idDetailFournisseur ;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration ;
    private String adresse ;
    private String matricule ;

    @OneToOne(mappedBy = "detailFournisseur")
    private Fournisseur fournisseur ;

}
