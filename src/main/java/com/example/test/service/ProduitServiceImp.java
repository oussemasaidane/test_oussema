package com.example.test.service;

import com.example.test.entities.Produit;
import com.example.test.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImp implements ProduitService {
    @Autowired
    ProduitRepository produitRepository ;

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public  Produit updateProduit(int id, Produit produit) {
        Produit Produit1 = produitRepository.findById(id).orElse(null);
        if (Produit1!=null){

            Produit1.setCodeProduit(produit.getCodeProduit());
            Produit1.setLibelleProduit(produit.getLibelleProduit());

            return produitRepository.save(Produit1);
        }
        else return null;
    }



    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }


    @Override
    public Produit getByIdProduit(int id) {
        return produitRepository.findById(id).orElse(null);
    }
}
