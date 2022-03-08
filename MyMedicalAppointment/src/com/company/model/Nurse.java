package com.company.model;

public class Nurse extends User{

    private String Speciality;

    public Nurse(String name, String email) {
        super(name, email);
        this.Speciality = Speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutriología, Pediatría");
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
