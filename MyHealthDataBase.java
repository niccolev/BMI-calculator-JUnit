package assignment1;

/**
* MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Your name here
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData
*/

public class MyHealthDataBase {
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return the patient's bmi, rounded to two decimal places.
    */
    public double calculateBMI(double weightParam, double heightParam) {
        double bmi = (weightParam * 703) / (heightParam * heightParam);
        return Math.round(bmi * 10.0) / 10.0; // Round to one decimal place
    }
    
    /** 
    * This method returns the incorrect BMI on purpose. used for Junit testing.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return the patient's bmi, rounded to two decimal places.
    */
    public double incorrectBMI(double weightParam, double heightParam) {
        double bmi = (weightParam * 123) / (heightParam * weightParam);
        return Math.round(bmi * 10.0) / 10.0; // Round to one decimal place
    }
}




