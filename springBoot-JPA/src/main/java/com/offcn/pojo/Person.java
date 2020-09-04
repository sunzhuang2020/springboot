package com.offcn.pojo;

import javax.persistence.*;

@Entity
@Table(name="tab_person")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private int age;
    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
