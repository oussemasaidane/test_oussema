package com.example.test.controller;

import com.example.test.entities.Produit;
import com.example.test.entities.Stock;
import com.example.test.service.ProduitService;
import com.example.test.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Produit")
public class ProduitController {
    @Autowired
    ProduitService produitService;

    @GetMapping()
    public List<Produit> Produit (){
        return produitService.getAllProduit();
    }

    @PostMapping()
    public ResponseEntity<Produit> addProduit(@RequestBody Produit e){
        return ResponseEntity.ok(this.produitService.addProduit(e));
    }

    @PutMapping()
    public ResponseEntity<Produit> updateProduit (@RequestBody int id,Produit e){
        return ResponseEntity.ok(this.produitService.updateProduit(id,e));
    }

    @GetMapping("/{id}")
    public Produit retrieveStock (@PathVariable("id") Integer idE){
        return this.produitService.getByIdProduit(idE);
    }
}
