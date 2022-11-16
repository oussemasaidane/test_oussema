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
@Table(name = "Stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id")

    private long idStock ;
    private int qte ;
    private  int qteMin ;
    private String libelleStock ;


    @OneToMany(mappedBy = "stock")
    private  List<Produit> produits ;
}
