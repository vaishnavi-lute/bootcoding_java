package com.bootcoding.java.oops.encapsulation;

public class StudentApp {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Priyal");
        st.setStudentId("123");
        st.setRollNo(10626);
        st.setSection("B");
        st.setGrade("A+");
        st.print();

    }
}
