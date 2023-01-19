package com.codersbay.part1;

import java.util.Objects;

public class Person extends Node {

    public String surname;
    public String lastname;
    public String phoneNumber;

    public Person(){
    }

    public Person(String surname, String lastname, String phoneNumber){

        this.surname = surname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public void Set(Person person){

        surname = person.surname;
        lastname = person.lastname;
        phoneNumber = person.phoneNumber;
    }
}
