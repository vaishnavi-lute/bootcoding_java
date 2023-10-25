package com.bootcoding.java.oops.encapsulation;

public class Student {
    private String studentId;
    private String name;
    private int rollNo;
    private String section;
    private String grade;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void print() {
       System.out.println("Student name = " + name);
       System.out.println("Student id = " + studentId);
       System.out.println("Student roll no. = " + rollNo);
       System.out.println("Student section = " + section);
       System.out.println("Student grade = " + grade);

    }
}
