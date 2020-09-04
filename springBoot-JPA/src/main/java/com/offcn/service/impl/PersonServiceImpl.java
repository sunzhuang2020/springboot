package com.offcn.service.impl;

import com.offcn.dao.PersonDao;
import com.offcn.pojo.Person;
import com.offcn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;
    @Override
    public Person getOne(Long id){
      return   personDao.getOne(id);
    }
    @Override
    public List<Person> findAll(){
       return personDao.findAll();
    }
    @Override
    public void save(Person person){
        personDao.save(person);
    }
    @Override
    public void saveAndFlush(Person person){
        personDao.saveAndFlush(person);
    }
    @Override
    public void delete(Long id){
        personDao.deleteById(id);
    }
}
