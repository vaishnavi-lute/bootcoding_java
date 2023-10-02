package com.bootcoding.java.string;

import java.lang.String;

public class StringEx1 {
    public static void main(String[] args) {
        // how to create string in java
        String name = "SamSung"; //
        char[] chars = name.toCharArray();
        //[s,a,m,S,u,n,g]
        //[0,1,2,3,4,5,6]
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("S"));
        System.out.println(name.lastIndexOf("S"));

        String s1 = "Ramesh";
        String s2 = "Ganesh";

        if (s1.equals(s2)) {
            System.out.println("Names are same!");
        } else {
            System.out.println("Names are Different");
        }
        // equals() - compare 2 strings

        String technology = "java,c,c++"; //break
        //split
        String[] split = technology.split(" , ");
        String date = "12/8/2023";
        String[] split1 = date.split("/");
        String text = "from the target vm";

        String[] textsplit = text.split(" ");
        String tech1 = "Java";
        String tech2 = "JAVA";
        System.out.println("java".equals(tech2));

        String ram = "drRamesh";
        //substring() - beginIndex and endIndex
        String substring = ram.substring(0, 2);
        String sub2 = ram.substring(2, 8);
        System.out.println(substring);
        // == -> equality Comparison
        // equals() -> Equality comparison
        // == - compares reference of 2 strings
        // equals() - compare values of 2 strings
        //split(",") - "HTML,CSS,MySQl,JAVA"
        //"HTML"
        //"CSS"
        //"MySQL"
        //"JAVA"

        //substring(beginIndex,lastIndex) - "springBoot"
        // subString(0,5) -> spring

    }


}