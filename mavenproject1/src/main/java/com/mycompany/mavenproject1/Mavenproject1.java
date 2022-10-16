/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author User
 */

/* 

   1) add java interface to an existing project 

   2) modify the above program by adding abstract method called animalShape() and get user input the colour of animal
   and display it inside the abstract method implementation

   3) create an abstract method called animalFeet() which takes and integer parameter that is number of feets which
   animal contains, get the user input from the user and display the number of feets inside the abstract method

   4)modify the above program by adding an abstract method called animalAge() which takes age of the animal as an integer 
   parameter, from the method check whether animal is an adult or child and return 1 or 0 accordingly, from the main method
   check whether the return value is 1 and display the output as an adult else if output should be child
   
*/

public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Pig myPig = new Pig();

        myPig.animalSound();
        myPig.sleep();
        myPig.animalShape();
        
        System.out.print("Enter animal feet count : ");
        int feet = input.nextInt();
        
        myPig.animalFeet(feet);
        
        System.out.print("Enter animal age : ");
        int age = input.nextInt();
        
        int answer = myPig.animalAge(age);
        
        if(answer == 1){
            System.out.println("Adult");
        }
        else{
            System.out.println("Child");
        }

    }
}
