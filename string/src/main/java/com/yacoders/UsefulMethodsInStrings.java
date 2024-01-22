package com.yacoders;

// various useful methods in strings
public class UsefulMethodsInStrings {
    public static void main(String[] args) {
      String s="Hello World";
        System.out.println(s.charAt(0));// returns the character at the specified index
        System.out.println(s.length());// returns the length of the string
        System.out.println(s.substring(0,5));// returns the substring from the specified index to end index
        System.out.println(s.substring(6));// returns the substring from the specified index
        System.out.println(s.concat("!!!"));// returns the concatenated string
        System.out.println(s.contains("World"));// returns true if the string contains the specified sequence of char values
        System.out.println(s.equals("Hello World"));// returns true if the string is equal to the specified object
        System.out.println(s.equalsIgnoreCase("hello world"));// returns true if the string is equal to the specified object ignoring case
        System.out.println(s.indexOf("World"));// returns the index of the first occurrence of the specified substring
        System.out.println(s.lastIndexOf("l"));// returns the index of the last occurrence of the specified substring
        System.out.println(s.isEmpty());// returns true if the string is empty
        System.out.println(s.replace("World","Java"));// returns a string replacing all the old char to new char
        System.out.println(s.toLowerCase());// returns a string in lowercase
        System.out.println(s.toUpperCase());// returns a string in uppercase
        System.out.println(s.trim());// returns a string with no leading and trailing spaces
        System.out.println(s.toCharArray());// returns a char array representation of the string
        System.out.println(s.startsWith("Hello"));// returns true if the string starts with the specified prefix
        System.out.println(s.endsWith("World"));// returns true if the string ends with the specified suffix
        System.out.println(s.matches("Hello World"));// returns true if the string matches the specified regex
    }
}
