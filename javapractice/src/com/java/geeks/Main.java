package com.java.geeks;

public class Main {
    public static void main(String[] args) {
        char characters[] = { 'G', 'f', 'g' };
        char characters1[] = { 'G', 'f', 'g' };


        String firstString = new String(characters);
        String secondString = new String(characters1);

        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(firstString.equals(secondString));
    }
}
