package com.yacoders;

// various ways to create a string
public class StringCreation {
    public static void main(String[] args) {
        String str1 = "Hello"; // String literal
        String str2 = new String("Hello"); // String object
        String str3 = new String(new char[]{'H', 'e', 'l', 'l', 'o'}); // String object from char array
        String str4 = new String(new byte[]{72, 101, 108, 108, 111}); //string object from byte array
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
