package com.example.test.service;

import com.example.test.entities.CategorieProduit;

import java.util.List;

public interface CategorieProduitService {
    CategorieProduit addCategorieProduit(CategorieProduit categorieProduit);

    CategorieProduit updateCategorieProduit(int id, CategorieProduit CategorieProduit);

    String deleteCategorieProduit(CategorieProduit CategorieProduit);

    List<CategorieProduit> getAllCategorieProduit();

    CategorieProduit getById(int id);
}
