package com.example.test.service;

import com.example.test.entities.CategorieProduit;
import com.example.test.repository.CategorieProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieProduitServiceImp implements CategorieProduitService{

    @Autowired
    CategorieProduitRepository categorieProduitRepository;

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit categorieProduit) {
        return categorieProduitRepository.save(categorieProduit);
    }

    @Override
    public CategorieProduit updateCategorieProduit(int id, CategorieProduit CategorieProduit) {
        CategorieProduit CategorieProduit1 = categorieProduitRepository.findById(id).orElse(null);
        if (CategorieProduit1!=null){

            CategorieProduit1.setCodeProduit(CategorieProduit.getCodeProduit());
            CategorieProduit1.setLibelleCategorieProduit(CategorieProduit.getLibelleCategorieProduit());

            return categorieProduitRepository.save(CategorieProduit1);
        }
        else return null;
    }


    @Override
    public String deleteCategorieProduit(CategorieProduit CategorieProduit) {
        if(CategorieProduit != null){
            categorieProduitRepository.delete(CategorieProduit);
            return "categorieProduit  supprimé";
        }
        return "categorieProduit non existant";

    }


    @Override
    public List<CategorieProduit> getAllCategorieProduit() {
        return categorieProduitRepository.findAll();
    }


    @Override
    public CategorieProduit getById(int id) {
        return categorieProduitRepository.findById(id).orElse(null);
    }
}
