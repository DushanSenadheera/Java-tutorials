/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pig implements Animal {
    
    Scanner input = new Scanner(System.in);

    @Override
    public void animalSound() {
        System.out.println("The pig says : Wee Wee...");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ...");
    }
    
    @Override
    public void animalShape(){
        System.out.print("Enter animal colour : ");
        String colour = input.next();
        System.out.println("Animal colour : "+colour);
    }
    
    @Override
    public void animalFeet(int feet){
        
        System.out.println("animal have "+feet+" legs");
    }
    
    @Override
    public int animalAge(int age){
        if(age>=18){
            return 1;
        }
        else{
            return 0;
        }
    }
}
