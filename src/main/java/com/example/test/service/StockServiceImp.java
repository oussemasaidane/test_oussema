package com.example.test.service;

import com.example.test.entities.Stock;
import com.example.test.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImp implements StockService{

    @Autowired
    StockRepository stockRepository ;

    @Override
    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock updateStock(int id, Stock stock) {
        Stock stock1 = stockRepository.findById(id).orElse(null);
        if (stock1!=null){

            stock1.setQte(stock.getQte());
            stock1.setQteMin(stock.getQteMin());
            stock1.setLibelleStock(stock.getLibelleStock());
            return stockRepository.save(stock1);
        }
        else return null;
    }


    @Override
    public String deleteStock(Stock stock) {
        if(stock != null){
            stockRepository.delete(stock);
            return "stock  supprimé";
        }
        return "stock non existant";

    }


    @Override
    public List<Stock> getAllstocks() {
        return  stockRepository.findAll();
    }


    @Override
    public Stock getByIdStock(int id) {
        return  stockRepository.findById(id).orElse(null);
    }


}
