package com.offcn.controller;

import com.offcn.pojo.Person;
import com.offcn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/manageruser")
public class PersonController {

    //修改个bug
    @Autowired
    private PersonService personService;
     @GetMapping("/")
    public String findAll(Model model){
         List<Person> all = personService.findAll();
         model.addAttribute("page",all);
          return "user/list";
     }

    @GetMapping("/toEdit/{id}")
    public String getOne(@PathVariable("id") Long id, Model model){
        Person one = personService.getOne(id);
        model.addAttribute("user",one);
         return  "user/userEdit";

    }
    @RequestMapping("/toAdd")
    public String toadd(Person user) {
        return "user/userAdd";
    }


    @PostMapping("/add")
    public String save(Person person){
         personService.save(person);
         return "redirect:/manageruser/";
    }
    @RequestMapping("/edit")
    public String saveAndFlush(Person person){
         personService.saveAndFlush(person);
         return "redirect:/manageruser/";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
         personService.delete(id);
         return "redirect:/manageruser/";
    }
}
