package com.example.test.service;

import com.example.test.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit addProduit(Produit produit);

    Produit updateProduit(int id, Produit produit);

    List<Produit> getAllProduit();

    Produit getByIdProduit(int id);
}
