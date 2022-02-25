package com.company.model;

import java.util.Date;

public class Patient extends User {
    //Atributos

    private Date birhtday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email) {
        super(name, email);
    }

    @Override
    public String toString() {
        return super.toString()
                 + "birhtday=" + birhtday +
                ", blood='" + blood + '\'' +
                '}';

    }

}


