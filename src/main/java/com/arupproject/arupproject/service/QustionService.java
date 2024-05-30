package com.arupproject.arupproject.service;

import java.util.List;


import com.arupproject.arupproject.entity.Qustion;

public interface QustionService {
    

    Qustion creaQustion(Qustion qustion);

    List<Qustion> getQustion();

    Qustion updateQustion(Qustion qustion,Integer Id);

    String delete(Integer id);

}
