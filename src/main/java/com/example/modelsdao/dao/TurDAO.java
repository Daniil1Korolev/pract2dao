package com.example.modelsdao.dao;

import com.example.modelsdao.model.PersonModel;
import com.example.modelsdao.model.TurModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TurDAO {

    private static int TUR_COUNT;
    private List<TurModel> tur;
    {
        tur = new ArrayList<>();

        tur.add(new TurModel(++TUR_COUNT,"Тур Амстердам",100400, "Амстердам","Нидерланды"));
        tur.add(new TurModel(++TUR_COUNT,"Тур Анапа",65000, "Анапа","Россия"));
        tur.add(new TurModel(++TUR_COUNT,"Тур Египет",99300, "Анкара","Египет"));
        tur.add(new TurModel(++TUR_COUNT,"Тур Сочи",55000, "Сочи","Россия"));
    }

    public List<TurModel> index(){

        return tur;
    }

    public TurModel show(int id){
        return tur.stream().filter(turModel -> turModel.getId() == id).findAny().orElse(null);
    }

    public void save(TurModel turch){
        turch.setId(++TUR_COUNT);
        tur.add(turch);
    }

    public void update(int id, TurModel turModel){
        TurModel updateTur = show(id);
        updateTur.setName(turModel.getName());
        updateTur.setPrice(turModel.getPrice());
        updateTur.setCity(turModel.getCity());
        updateTur.setCountry(turModel.getCountry());
    }

    public void delete(int id){

        tur.removeIf(p-> p.getId() == id);
    }

}
