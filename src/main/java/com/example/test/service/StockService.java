package com.example.test.service;

import com.example.test.entities.Stock;

import java.util.List;

public interface StockService {
    Stock addStock(Stock stock);

    Stock updateStock(int id, Stock stock);

    String deleteStock(Stock stock);

    List<Stock> getAllstocks();

    Stock getByIdStock(int id);
}
