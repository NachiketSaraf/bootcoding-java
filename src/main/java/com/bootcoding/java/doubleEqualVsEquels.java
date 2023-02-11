package com.bootcoding.java;

public class doubleEqualVsEquels {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String c = new String("java");
        String e = new String("java");
        String d = new String("java").intern();

        System.out.println(a==b);//it will check for reference is same or not
        System.out.println(a.equals(b));//it will check for the content in object

        System.out.println(a==c);
        // here the content is same but the reference and object is different so it will return false
        // because of the == operator
        System.out.println(a.equals(c));
        //here we use .equels() which check for the actual value inside the object
        //thats why it is returning true


    }
}
