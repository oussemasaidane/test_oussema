package com.example.test.controller;

import com.example.test.entities.Stock;
import com.example.test.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Stock")
public class StockController {


    @Autowired
    StockService stockService ;

    @GetMapping()
    public List<Stock> stock (){
        return stockService.getAllstocks();
    }

    @PostMapping()
    public ResponseEntity<Stock> addStock(@RequestBody Stock e){
        return ResponseEntity.ok(this.stockService.addStock(e));
    }

    @PutMapping()
    public ResponseEntity<Stock> updateStock (@RequestBody int id,Stock e){
        return ResponseEntity.ok(this.stockService.updateStock(id,e));
    }

    @GetMapping("/{id}")
    public Stock retrieveStock (@PathVariable("id") Integer idE){
        return this.stockService.getByIdStock(idE);
    }
    @DeleteMapping("{id}")
    public String deleteStock(@PathVariable("id")int id){
        return stockService.deleteStock(stockService.getByIdStock(id));
    }
}
