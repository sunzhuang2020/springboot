package com.offcn.service;

import com.offcn.dao.PersonDao;
import com.offcn.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;
    public void save(Person person) {
        personDao.save(person);
    }

    public List<Person> findAll() {
       return personDao.findAll();
    }

    public Person findById(Long id) {
       return personDao.findById(id).get();
    }

    public void deleteById(Long id) {
        personDao.deleteById(id);
    }

    public void saveAndFlush(Person person) {
        personDao.saveAndFlush(person);
    }
}
