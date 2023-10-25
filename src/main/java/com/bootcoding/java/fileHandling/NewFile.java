package com.bootcoding.java.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) {

        // code to create a new file
        File myfile =new File("file.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to Create this file");
            throw new RuntimeException(e);
        }
        //code to write a file
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("file.txt");
            fileWriter.write("This is our first file from this java course");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        myfile = new File("file.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//        // creating a code for delete a file
//        /* myfile = new File("file.txt");
//        if(myfile.delete()){
//            System.out.println("I have deleted: " + myfile.getName());
//        }
//        else {
//            System.out.println("some error occurred while deleting the file");
//        }*/
    }
}
