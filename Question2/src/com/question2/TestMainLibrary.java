package com.question2;

import java.util.Scanner;

public class TestMainLibrary {
	
    public static void main(String[] args) {
        Author author1 =new Author("Jon", 25, "Male");
        Author author2 =new Author("Joseph",26, "Male");
        Author author3 =new Author("Pooja", 29, "Female");
        Author author4 =new Author("Tiger", 40, "Male");
        Author author5 =new Author("Tamsi", 29, "Male");
        Book[] book =new Book[5];
        book[0] =new Book("java", author1, 100, 200, 300);
        book[1] =new Book("j2ee", author2, 100, 200, 400);
        book[2] =new Book("C++", author3, 200, 500, 103);
        book[3] =new Book("Docker", author4, 400, 800, 104);
        book[4] =new Book("AWS", author5, 100, 400, 105);
        try {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter book index number to get the details");
        int indexnumber = scanner.nextInt();
        System.out.println("Book detals:"+book[indexnumber]);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }	
}
