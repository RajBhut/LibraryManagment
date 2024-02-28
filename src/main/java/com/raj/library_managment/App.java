package com.raj.library_managment;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Enter your user name and passsword: ");
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       String password = sc.next();
       new Login().login(name, password);
       
    }
   
}
