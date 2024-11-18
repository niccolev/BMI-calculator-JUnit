package assignment1;

import java.util.Scanner;

/**
 * This class tests the MyHealthData class by allowing a user to input their health data
 * and then displaying the health information of the patient.
 * It captures user input for attributes such as first name, last name, gender, year of birth,
 * weight, and height, and then creates an instance of MyHealthData to display the calculated health metrics.
 * 
 * Assignment 1: MyHealthDataTest.java
 * 23F CST8284
 * 
 * @author Niccole Vorobiov
 */
public class MyHealthDataTest {

    /**
     * The main method runs the program. It prompts for user inputs,
     * creates a MyHealthData object, and displays the patient's health information.
     * 
     * @param args for method main
     */
    public static void main(String[] args) {
    	// Instantiating a new scanner keyboard object to read user's inputs
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt the user to enter their first name and saves input in a variable
        System.out.println("Welcome to our clinic! Please fill the registration form. \nPlease enter your first name: ");
        String firstName = keyboard.nextLine();
        
        // Prompt the user to enter their last name and saves input in a variable
        System.out.println("Next, please enter your last name: ");
        String lastName = keyboard.nextLine();
        
        // Prompt the user to enter their gender and saves input in a variable
        System.out.println("\nWhat is your gender at birth? ");
        String gender = keyboard.nextLine();
        
        // Prompt the user to enter their year of birth and saves input in a variable
        System.out.println("What is your year of birth?");
        int patientYOB = keyboard.nextInt();
        
        // Prompt the user to enter their weight in lbs and saves input in a variable
        System.out.println("What is your weight in lbs?");
        double weight = keyboard.nextDouble();
        
        // Prompt the user to enter their height in inches and saves input in a variable
        System.out.println("What is your height in inches?");
        double height = keyboard.nextDouble();
        
        // Create a MyHealthData object using the input data
        MyHealthData patient1 = new MyHealthData(firstName, lastName, gender, patientYOB, height, weight);
        
        // Displays the health data of the patient
        patient1.displayMyHealthData();
        
        // Close the scanner
        keyboard.close();
    }

}
