package com.offcn.controller;

import com.offcn.dao.PersonDao;
import com.offcn.entity.Person;
import com.offcn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
//今天星期五
        @Autowired
        private PersonService personService;

        @PostMapping("/")
        public void addPerson(@RequestBody Person person) {
            personService.save(person);
        }

        @GetMapping("/")
        public List<Person> getAllPerson() {
            return personService.findAll();
        }

        @GetMapping("/{id}")
        public Person getPerson(@PathVariable("id") Long id) {
            return personService.findById(id);

        }

        @DeleteMapping("/{id}")
        public void deletePerson(@PathVariable("id") Long id) {
            personService.deleteById(id);
        }

        @PutMapping("/")
        public void updatePerson(@RequestBody Person person) {
            personService.saveAndFlush(person);
        }


}
