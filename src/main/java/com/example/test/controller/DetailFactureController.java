package com.example.test.controller;

import com.example.test.entities.DetailFacture;
import com.example.test.entities.Stock;
import com.example.test.service.DetailFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("DetailFacture")
public class DetailFactureController {

    @Autowired
    DetailFactureService detailFactureService ;

    @GetMapping()
    public List<DetailFacture> DetailFacture (){
        return detailFactureService.getAllDetailFacture();
    }

    @PostMapping()
    public ResponseEntity< DetailFacture> addStock(@RequestBody  DetailFacture e){
        return ResponseEntity.ok(this.detailFactureService.addDetailFacture(e));
    }

    @PutMapping()
    public ResponseEntity< DetailFacture> updateStock (@RequestBody int id, DetailFacture e){
        return ResponseEntity.ok(this.detailFactureService.updateDetailFacture(id,e));
    }

    @GetMapping("/{id}")
    public DetailFacture retrieveStock (@PathVariable("id") Integer idE){
        return this.detailFactureService.getByIdDetailFacture(idE);
    }
    @DeleteMapping("{id}")
    public String deleteStock(@PathVariable("id")int id){
        return detailFactureService.deletedetailFacture(detailFactureService.getByIdDetailFacture(id));
    }
}
