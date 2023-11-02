package com.example.modelsdao.dao;

import com.example.modelsdao.model.TovarModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;




@Component
public class TovarDAO {

    private static int TOVAR_COUNT;
    private List<TovarModel> tovar;
    {
        tovar = new ArrayList<>();

        tovar.add(new TovarModel(++TOVAR_COUNT,555,33, "Огурцы","Овощи"));
        tovar.add(new TovarModel(++TOVAR_COUNT,333,44, "Помидоры","Овощи"));
        tovar.add(new TovarModel(++TOVAR_COUNT,4444,11, "Сыр","Молочка"));
        tovar.add(new TovarModel(++TOVAR_COUNT,2222,57, "Салат","Овощи"));
    }

    public List<TovarModel> index(){

        return tovar;
    }

    public TovarModel show(int id){
        return tovar.stream().filter(tovarModel -> tovarModel.getId() == id).findAny().orElse(null);
    }

    public void save(TovarModel person){
        person.setId(++TOVAR_COUNT);
        tovar.add(person);
    }

    public void update(int id, TovarModel tovarModel){
        TovarModel updateTovar = show(id);
        updateTovar.setPrice(tovarModel.getPrice());
        updateTovar.setKolvo(tovarModel.getKolvo());
        updateTovar.setName(tovarModel.getName());
        updateTovar.setVid(tovarModel.getVid());
    }


    public void delete(int id){
        tovar.removeIf(p-> p.getId() == id);
    }

}
