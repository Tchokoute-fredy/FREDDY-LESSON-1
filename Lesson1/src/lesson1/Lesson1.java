/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author jtcho
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    Account fredy = new Account();
    
    System.out.printf("Initial name is: %s%n%n", fredy.getName());
    
    System.out.println("Please enter the name:");
    
    String AccountNamefredy = input.nextLine();
    
    fredy.setName(AccountNamefredy);
    
    System.out.println(); 
    
    System.out.printf("Account Name is: "+fredy.getName() );
    
  

    }
}