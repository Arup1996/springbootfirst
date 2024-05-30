package com.arupproject.arupproject.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arupproject.arupproject.entity.Qustion;
import com.arupproject.arupproject.repository.QustionRepo;


@Service
public class QustionServicelist implements QustionService{

    @Autowired
    private QustionRepo qustionRepo;

    @Override
    public Qustion creaQustion(Qustion qustion) {
      Qustion q1=  qustionRepo.save(qustion);
      return q1;
        
    }

    @Override
    public List<Qustion> getQustion() {
        return qustionRepo.findAll();
    }

    @Override
    public Qustion updateQustion(Qustion qustion, Integer id) {
        Optional<Qustion> q1 =qustionRepo.findById(id);
        
        if(q1.isPresent()){
            Qustion q2 =q1.get();
            q2.setQustion(qustion.getQustion());
            q2.setOption_a(qustion.getOption_a());
            q2.setOption_b(qustion.getOption_b());
            q2.setOption_c(qustion.getOption_c());
            q2.setOption_d(qustion.getOption_d());
            
          return qustionRepo.save(q2);
        }
        return null;

    }

    @Override
    public String delete(Integer id) {
       qustionRepo.deleteById(id);
       return "delete success";
    }
    
}
