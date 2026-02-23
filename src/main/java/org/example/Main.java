package org.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("foad", "pythoncours", "programing", 330);
        Book book2 = new Book("far7e", "cookingforramadane", "cooking", 23);


        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
