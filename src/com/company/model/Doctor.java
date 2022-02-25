package com.company.model;

import java.util.Date;
import java.util.ArrayList;

public class Doctor extends User {

    private String Speciality;

    public Doctor(String name, String email) {
        super(name, email);
        this.Speciality = Speciality;
    }




        ArrayList<AvailableAppointment> AvailableAppointments = new ArrayList<>();

        public void addAvailableAppointment(Date date, String time) {
            AvailableAppointments.add(new AvailableAppointment(date, time));
        }

        public ArrayList<AvailableAppointment> getAvailableAppointments() {
            return AvailableAppointments;
        }

        public String getSpeciality() {
            return Speciality;
        }

        public void setSpeciality(String speciality) {
            Speciality = speciality;
        }

        @Override
        public String toString() {
            return  super.toString() + "\nSpeciallity: " +Speciality + "\nAvailable: "
                    +AvailableAppointments.toString();
    }


    //Available Apointment = Cita Disponible
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment \nDate: "+date+"\nTime: "+time;
        }
    }


}