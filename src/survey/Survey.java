/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

/**
* File: Survey.java
* Author: Clinton Harris
* Date: 24 May 2018
* Purpose: This program takes data received from the user and outputs
* that same data formatted
*/

//Importing required Java Class
import java.util.Scanner;
import java.text.*;

public class Survey {
    
    public static void main(String[] args) {
        //initializing a scanner variable
        Scanner scannerIn = new Scanner(System.in);
        
        //initializing needed variables
        int emplId = 0;
        double quiz1 = 0.0;
        double quiz2 = 0.0;
        double quiz3 = 0.0;
        double averageScore = 0.0;
        int ageYears = 0;
        double tempF = 0;
        double tempC = 0;
        
        //creating format for calculated numbers to be rounded to two dec places
        DecimalFormat df = new DecimalFormat("#.##");
        
        //degree symbol
        char degrees = '\u00b0';
        
        //getting EmplId from user and confirming
        System.out.print("Enter your Student EmplID: ");
        emplId = scannerIn.nextInt();
        System.out.println("Student EmplID entered: " + emplId + "\n");
        
        //getting quiz1 value
        System.out.print("Enter your Quiz 1 result: ");
        quiz1 = scannerIn.nextDouble();
        System.out.println("Quiz 1 value entered: " + df.format(quiz1) + "\n");
        
        //getting quiz2 value
        System.out.print("Enter your Quiz 2 result: ");
        quiz2 = scannerIn.nextDouble();
        System.out.println("Quiz 2 value entered: " + df.format(quiz2) + "\n");
        
        //getting quiz3 value
        System.out.print("Enter your Quiz 3 result: ");
        quiz3 = scannerIn.nextDouble();
        System.out.println("Quiz 3 value entered: " + df.format(quiz3) + "\n");
        
        //getting age
        System.out.print("Enter your age in years: ");
        ageYears = scannerIn.nextInt();
        System.out.println("Age entered: " + ageYears + "\n");
        
        //getting temp in F
        System.out.print("Enter the current temperature in Fahrenheit: ");
        tempF = scannerIn.nextDouble();
        System.out.println("Temperature (F) entered: " + tempF + "\n");
        
        //display thank you
        System.out.println("******** Thank you for completing this survey" 
        + " ***********************************\n");
        
        //calculations
        averageScore = (quiz1 + quiz2 + quiz3)/ 3;
        tempC = ((tempF-32) * 5)/9;
        
        //display entered info
        System.out.println("Student EmplID: " + emplId + "\n");
        System.out.println("Quiz 1 Score: " + df.format(quiz1) + "\n");
        System.out.println("Quiz 2 Score: " + df.format(quiz2) + "\n");
        System.out.println("Quiz 3 Score: " + df.format(quiz3) + "\n");
        System.out.println("Quiz Average Score: " + df.format(averageScore) + "\n");
        System.out.println("Student Age: " + ageYears + "\n");
        System.out.println("Temperature(F): " + df.format(tempF) + degrees + "\n");
        System.out.println("Temperature(C): " + df.format(tempC) + degrees + "\n");
        
    }
    
}
