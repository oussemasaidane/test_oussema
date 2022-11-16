package com.example.test.service;

import com.example.test.entities.DetailFacture;

import java.util.List;


public interface DetailFactureService {
    DetailFacture addDetailFacture(DetailFacture detailFacture);

    DetailFacture updateDetailFacture(int id, DetailFacture detailFacture);

    String deletedetailFacture(DetailFacture detailFacture);

    List<DetailFacture> getAllDetailFacture();

    DetailFacture getByIdDetailFacture(int id);
}
