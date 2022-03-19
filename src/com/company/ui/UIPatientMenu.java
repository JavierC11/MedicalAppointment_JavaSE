//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company.ui;

import java.util.Scanner;

public class UIPatientMenu {
    public UIPatientMenu() {
    }

    public static void showPatientMenu() {
        boolean var0 = false;

        int response;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patinetLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch(response) {
                case 0:
                    UIMenu.showMenu();
                case 1:
                    showBookAppointmentMenu();
                case 2:
                    showPatientMyAppointments();

            }
        } while(response != 0);

    }

    private static void showBookAppointmentMenu() {
        boolean response = false;

        do {
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");
        } while(response);

    }

    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println("::My Appointments");
            if (UIMenu.patinetLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patinetLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patinetLogged.getAppointmentDoctors().get(i).getDate() +
                        " Time: " + UIMenu.patinetLogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.patinetLogged.getAppointmentDoctors().get(i).getDoctor().getName()
                );
            }

            System.out.println("0. Return");
        }while (response!=0);
    }
}


