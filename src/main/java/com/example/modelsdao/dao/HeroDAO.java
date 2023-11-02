package com.example.modelsdao.dao;

import com.example.modelsdao.model.HeroModel;
import com.example.modelsdao.model.TovarModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class HeroDAO {

    private static int HERO_COUNT;
    private List<HeroModel> hero;
    {
        hero = new ArrayList<>();

        hero.add(new HeroModel(++HERO_COUNT,"Axe","High", "Сила","Частый"));
        hero.add(new HeroModel(++HERO_COUNT,"Windranger","Medium", "Универсал","Средний"));
        hero.add(new HeroModel(++HERO_COUNT,"Riki","High", "Ловкость","Частый"));
        hero.add(new HeroModel(++HERO_COUNT,"Witch Doctor","Medium", "Интеллект","Частый"));
    }

    public List<HeroModel> index(){

        return hero;
    }

    public HeroModel show(int id){
        return hero.stream().filter(heroModel -> heroModel.getId() == id).findAny().orElse(null);
    }

    public void save(HeroModel person){
        person.setId(++HERO_COUNT);
        hero.add(person);
    }

    public void update(int id, HeroModel heroModel){
        HeroModel updateHero = show(id);
        updateHero.setName(heroModel.getName());
        updateHero.setSila(heroModel.getSila());
        updateHero.setAttribute(heroModel.getAttribute());
        updateHero.setRare(heroModel.getRare());
    }


    public void delete(int id){
        hero.removeIf(p-> p.getId() == id);
    }

}
