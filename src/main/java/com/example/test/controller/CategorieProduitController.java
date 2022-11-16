package com.example.test.controller;


import com.example.test.entities.CategorieProduit;
import com.example.test.entities.DetailFacture;
import com.example.test.service.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CategorieProduit")
public class CategorieProduitController {

    @Autowired
    CategorieProduitService categorieProduitService ;

    @GetMapping()
    public List<CategorieProduit> CategorieProduit (){
        return categorieProduitService.getAllCategorieProduit();
    }

    @PostMapping()
    public ResponseEntity< CategorieProduit> addCategorieProduit(@RequestBody CategorieProduit e){
        return ResponseEntity.ok(this.categorieProduitService.addCategorieProduit(e));
    }

    @PutMapping()
    public ResponseEntity<CategorieProduit> updateCategorieProduit (@RequestBody int id, CategorieProduit e){
        return ResponseEntity.ok(this.categorieProduitService.updateCategorieProduit(id,e));
    }

    @GetMapping("/{id}")
    public CategorieProduit retrieveCategorieProduit (@PathVariable("id") Integer idE){
        return this.categorieProduitService.getById(idE);
    }
    @DeleteMapping("{id}")
    public String deleteCategorieProduit(@PathVariable("id")int id){
        return categorieProduitService.deleteCategorieProduit(categorieProduitService.getById(id));
    }
}
