package com.example.modelsdao.controller;

import com.example.modelsdao.dao.*;
import com.example.modelsdao.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private PersonDAO _personDAO;
    private GameDAO _gameDAO;
    private TovarDAO _tovarDAO;
    private TurDAO _turDAO;
    private HeroDAO _heroDAO;

    @Autowired
    public HomeController(PersonDAO personDAO, GameDAO gameDAO,TovarDAO tovarDAO,TurDAO turDAO, HeroDAO heroDAO){
        _personDAO = personDAO;
        _gameDAO = gameDAO;
        _tovarDAO = tovarDAO;
        _turDAO = turDAO;
        _heroDAO = heroDAO;
    }
    @GetMapping()
    public String main(Model model){
        model.addAttribute("people", _personDAO.index());
        return "main";
    }
    @GetMapping("/indexPerson")
    public String index(Model model){
        model.addAttribute("people", _personDAO.index());
        return "indexPerson";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        // Вывод определенного пользователя
        model.addAttribute("person", _personDAO.show(id));
        return "showPerson";
    }


    @GetMapping("/newPerson")
    public String newPerson(@ModelAttribute("person") PersonModel personModel){
        // model.addAttribute("person", new PersonModel());
        return "newPerson";
    }

    @PostMapping("person")
    public String create(@ModelAttribute("person") PersonModel personModel){
        _personDAO.save(personModel);
        return "redirect:/indexPerson";
    }


    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("person",_personDAO.show(id));
        return "editPerson";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") PersonModel personModel, @PathVariable("id") int id){
        _personDAO.update(id,personModel);
        return "redirect:/indexPerson";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        _personDAO.delete(id);
        return "redirect:/indexPerson";
    }

//-------------------------Game-------------------------------------------------------

    @GetMapping("/indexGame")
    public String indexGame(Model model){
        model.addAttribute("game", _gameDAO.index());
        return "indexGame";
    }

    @GetMapping("/{id}/game")
    public String showGame(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("game", _gameDAO.show(id));
        return "showGame";
    }


    @GetMapping("/newGame")
    public String newGame(@ModelAttribute("game") GameModel gameModel){
        // model.addAttribute("person", new PersonModel());
        return "newGame";
    }

    @PostMapping("game")
    public String createGame(@ModelAttribute("game") GameModel gameModel){
        _gameDAO.save(gameModel);
        return "redirect:/indexGame";
    }


    @GetMapping("/{id}/editGame")
    public String editGame(Model model, @PathVariable("id") int id){
        model.addAttribute("game",_gameDAO.show(id));
        return "editGame";
    }



    @PatchMapping("/{id}/game")
    public String updateGame(@ModelAttribute("game") GameModel gameModel, @PathVariable("id") int id){
        _gameDAO.update(id,gameModel);
        return "redirect:/indexGame";
    }

    @DeleteMapping("/{id}/game")
    public String deleteGame(@PathVariable("id") int id){
        _gameDAO.delete(id);
        return "redirect:/indexGame";
    }

//----------------------Tovar------------------------------------------

    @GetMapping("/indexTovar")
    public String indexTovar(Model model){
        model.addAttribute("tovar", _tovarDAO.index());
        return "indexTovar";
    }

    @GetMapping("/{id}/tovar")
    public String showTovar(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("tovar", _tovarDAO.show(id));
        return "showTovar";
    }


    @GetMapping("/newTovar")
    public String newTovar(@ModelAttribute("tovar") TovarModel tovarModel){
        // model.addAttribute("person", new PersonModel());
        return "newTovar";
    }

    @PostMapping("tovar")
    public String createTovar(@ModelAttribute("tovar") TovarModel tovarModel){
        _tovarDAO.save(tovarModel);
        return "redirect:/indexTovar";
    }


    @GetMapping("/{id}/editTovar")
    public String editTovar(Model model, @PathVariable("id") int id){
        model.addAttribute("tovar",_tovarDAO.show(id));
        return "editTovar";
    }



    @PatchMapping("/{id}/tovar")
    public String updateTovar(@ModelAttribute("tovar") TovarModel tovarModel, @PathVariable("id") int id){
        _tovarDAO.update(id,tovarModel);
        return "redirect:/indexTovar";
    }

    @DeleteMapping("/{id}/tovar")
    public String deleteTovar(@PathVariable("id") int id){
        _tovarDAO.delete(id);
        return "redirect:/indexTovar";
    }

//------------------Tur-------------------------------------------------
@GetMapping("/indexTur")
public String indexTur(Model model){
    model.addAttribute("tur", _turDAO.index());
    return "indexTur";
}

    @GetMapping("/{id}/tur")
    public String showTur(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("tur", _turDAO.show(id));
        return "showTur";
    }



    @GetMapping("/newTur")
    public String newTur(@ModelAttribute("tur") TurModel turModel){
        // model.addAttribute("person", new PersonModel());
        return "newTur";
    }

    @PostMapping("tur")
    public String createTur(@ModelAttribute("tur") TurModel turModel){
        _turDAO.save(turModel);
        return "redirect:/indexTur";
    }


    @GetMapping("/{id}/editTur")
    public String editTur(Model model, @PathVariable("id") int id){
        model.addAttribute("tur",_turDAO.show(id));
        return "editTur";
    }



    @PatchMapping("/{id}/tur")
    public String updateTur(@ModelAttribute("tur") TurModel turModel, @PathVariable("id") int id){
        _turDAO.update(id,turModel);
        return "redirect:/indexTur";
    }

    @DeleteMapping("/{id}/tur")
    public String deleteTur(@PathVariable("id") int id){
        _turDAO.delete(id);
        return "redirect:/indexTur";
    }

//------------Hero--------------------------------------------------------

    @GetMapping("/indexHero")
    public String indexHero(Model model){
        model.addAttribute("hero", _heroDAO.index());
        return "indexHero";
    }

    @GetMapping("/{id}/hero")
    public String showHero(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("hero", _heroDAO.show(id));
        return "showHero";
    }


    @GetMapping("/newHero")
    public String newHero(@ModelAttribute("hero") HeroModel heroModel){
        // model.addAttribute("person", new PersonModel());
        return "newHero";
    }

    @PostMapping("hero")
    public String createHero(@ModelAttribute("hero") HeroModel heroModel){
        _heroDAO.save(heroModel);
        return "redirect:/indexHero";
    }


    @GetMapping("/{id}/editHero")
    public String editHero(Model model, @PathVariable("id") int id){
        model.addAttribute("hero",_heroDAO.show(id));
        return "editHero";
    }



    @PatchMapping("/{id}/hero")
    public String updateHero(@ModelAttribute("hero") HeroModel heroModel, @PathVariable("id") int id){
        _heroDAO.update(id,heroModel);
        return "redirect:/indexHero";
    }

    @DeleteMapping("/{id}/hero")
    public String deleteHero(@PathVariable("id") int id){
        _heroDAO.delete(id);
        return "redirect:/indexHero";
    }









}
