package com.bootcoding.java.oops.encapsulation;

import java.util.Date;

public class HospitalApp {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.name = "nikita";
        p.dateOfAdmission = new Date();
        p.print();
    }
}
