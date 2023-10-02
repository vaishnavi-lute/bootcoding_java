package com.bootcoding.java.string;

public class StringExCode2 {
    public static void main(String[] args) {
        //1.1.1.1
        //1[.]1[.]1[.]1
        String ipaddress= "1.1.1.1";
        StringBuilder sb = new StringBuilder();
        String[] tokens = ipaddress.split("[.]");
        for (int i=0; i < tokens.length; i++){
            String ip = tokens[i];
            sb.append("1");
            sb.append("[");
            sb.append(".");
            sb.append("]");
          //  System.out.println(sb);
        }
        String outputStr = sb.toString();
        System.out.println(outputStr);

    }
}