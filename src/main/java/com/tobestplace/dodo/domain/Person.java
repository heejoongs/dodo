package com.tobestplace.dodo.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "PERSONS")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERSON_NO")
    private Long no;

    @Column(name = "PERSON_NAME")
    private String name;

    protected Person() {}

    public Person(String name) {
        this.name = name;
    }
}
