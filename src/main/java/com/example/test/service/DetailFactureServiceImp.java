package com.example.test.service;

import com.example.test.entities.DetailFacture;
import com.example.test.repository.DetailFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailFactureServiceImp implements DetailFactureService{

    @Autowired
    DetailFactureRepository detailFactureRepository;


    @Override
    public DetailFacture addDetailFacture(DetailFacture detailFacture) {
        return detailFactureRepository.save(detailFacture);
    }

    @Override
    public DetailFacture updateDetailFacture(int id, DetailFacture detailFacture) {
        DetailFacture detailFacture1 = detailFactureRepository.findById(id).orElse(null);
        if (detailFacture1!=null){

            detailFacture1.setQteCommandee(detailFacture.getQteCommandee());
            detailFacture1.setPrixTotalDetail(detailFacture.getQteCommandee());
            detailFacture1.setPourcentageRemise(detailFacture.getQteCommandee());
            detailFacture1.setMontantRemise(detailFacture.getQteCommandee());

            return detailFactureRepository.save(detailFacture1);
        }
        else return null;
    }


    @Override
    public String deletedetailFacture(DetailFacture detailFacture) {
        if(detailFacture != null){
            detailFactureRepository.delete(detailFacture);
            return "detailFacture supprimé";
        }
        return "detailFacture non existant";

    }


    @Override
    public List<DetailFacture> getAllDetailFacture() {
        return   detailFactureRepository.findAll();
    }


    @Override
    public DetailFacture getByIdDetailFacture(int id) {
        return   detailFactureRepository.findById(id).orElse(null);
    }



}
