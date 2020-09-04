package com.offcn.service;

import com.offcn.pojo.Person;

import java.util.List;

public interface PersonService {

    public Person getOne(Long id);

    public List<Person> findAll();

    public void save(Person person);

    public void saveAndFlush(Person person);

    public void delete(Long id);
}
