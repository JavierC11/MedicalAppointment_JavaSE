package com.company;

import com.company.model.Doctor;
import com.company.model.Patient;
import com.company.ui.UIMenu;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Doctor MyDoctor = new Doctor("Juan", "amial@avon.com");
        MyDoctor.addAvailableAppointment(new Date(),"7:00");
        MyDoctor.addAvailableAppointment(new Date(),"8:00");
        MyDoctor.addAvailableAppointment(new Date(),"9:00");
        MyDoctor.addAvailableAppointment(new Date(),"10:00");
        System.out.println(MyDoctor);
        Patient patient = new Patient("nombre",
                "coreo");
        System.out.println(patient);

/*        for(Doctor.AvailableAppointment aA: MyDoctor.getAvailableAppointments()){
            System.out.println( aA.getDate()+ "'" + aA.getTime());
*/
        UIMenu.showMenu();


    }
    }

