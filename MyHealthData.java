// Niccole Vorobiov 

package assignment1;

import java.time.LocalDate;

/**
 * The {@code MyHealthData} class maintains important health information about a patient.
 * This class includes methods to set and get patient details, calculate health metrics such as
 * age, BMI, and heart rate ranges, and display the data.
 * <p>Note: This class assumes values passed to the set methods are correct.</p>
 */
public class MyHealthData extends MyHealthDataBase {

    //23F CST8284
    //Assignment 1: MyHealthData.java

    //This system maintains important health information about a patient.
    //Note: This class assumes values passed to the set methods are correct.
    // REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
    //Remove unneeded comments when you are done.  Clean code is better code.


    //TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

    //START CODE
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private static final int CURRENT_YEAR = LocalDate.now().getYear();
    private double height;
    private double weight;
    private int age;
    //END CODE

    // TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
    //START CODE

    /**
     * Default constructor. Initializes an empty instance of {@code MyHealthData}.
     */
    public MyHealthData() {
    }

    /**
     * Initializes an instance of {@code MyHealthData} with the provided parameters.
     * 
     * @param firstName the patient's first name
     * @param lastName the patient's last name
     * @param gender the patient's gender
     * @param birthYear the patient's birth year
     * @param height the patient's height in meters
     * @param weight the patient's weight in kilograms
     */
    public MyHealthData(String firstName, String lastName, String gender, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }
    //END CODE

    //TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE.

    /**
     * Gets the patient's first name.
     * 
     * @return the patient's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the patient's first name.
     * 
     * @param firstName the patient's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the patient's last name.
     * 
     * @return the patient's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the patient's last name.
     * 
     * @param lastName the patient's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the patient's gender.
     * 
     * @return the patient's gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the patient's gender.
     * 
     * @param gender the patient's gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the patient's birth year.
     * 
     * @return the patient's birth year
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the patient's birth year.
     * 
     * @param birthYear the patient's birth year
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * Gets the current year.
     * 
     * @return the current year
     */
    public int getCurrentYear() {
        return CURRENT_YEAR;
    }

    /**
     * Gets the patient's height.
     * 
     * @return the patient's height in inches
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the patient's height.
     * 
     * @param height the patient's height in inches
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the patient's weight.
     * 
     * @return the patient's weight in lbs
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the patient's weight.
     * 
     * @param weight the patient's weight in lbs
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Sets the patient's age.
     * 
     * @param age the patient's age in years
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the patient's age.
     * 
     * @return the patient's age in years
     */
    public int getAge() {
        return age;
    }

    // TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION

    //The class must provide methods to calculate and return the patient’s:
    // a. Age (in years)
    // b. MaximumHeartRate (calculated as 220 – Age in years)
    // c. Target heart rate range, where
    //    i. MinimumTargetHeartRate is 50% of MaximumHeartRate, and
    //    ii. MaximumTargetHeartRate is 85% of MaximumHeartRate.
    // d. Body Mass Index (BMI). This calculation has already been provided for you

    /**
     * Calculates the patient's age based on the current year and patient's birth year.
     * 
     * @param currentYear the current year
     * @param birthYear the patient's birth year
     * @return the patient's age in years
     */
    public int calcAge(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        this.birthYear = birthYear;
        this.age = age;
        return age;
    }

    /**
     * Calculates the maximum heart rate of the patient.
     * 
     * @param birthYear the patient's birth year
     * @return the patient's maximum heart rate in beats per minute (bpm)
     */
    public int maximumHeartRate(int birthYear) {
        int age = calcAge(CURRENT_YEAR, birthYear);
        int maxHeartRate = 220 - age;
        return maxHeartRate;
    }     

    /**
     * Calculates the minimum target heart rate of the patient.
     * 
     * @param birthYear the patient's birth year
     * @return the patient's minimum target heart rate in beats per minute (bpm)
     */
    public int minTargetHeartRate(int birthYear) {
        int minimumTargetHeartRate = maximumHeartRate(birthYear) / 2;
        return minimumTargetHeartRate;
    }

    /**
     * Calculates the maximum target heart rate of the patient.
     * 
     * @param birthYear the patient's birth year
     * @return the patient's maximum target heart rate in beats per minute (bpm)
     */
    public int maxTargetHeartRate(int birthYear) {
        int maximumTargetHeartRate = (int) (maximumHeartRate(birthYear) * 0.85);
        return maximumTargetHeartRate;
    }

    /**
     * Displays all the patient's health data, including personal information, BMI, and heart rate metrics.
     */
    public void displayMyHealthData() {
        // TO DO 5: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.

        // START CODE
        setAge(calcAge(CURRENT_YEAR, birthYear));
        double bmi = calculateBMI(getWeight(), getHeight());

        System.out.printf("Patient's Health Data:\n");
        System.out.printf("First Name: %s\n", getFirstName());
        System.out.printf("Last Name: %s\n", getLastName());
        System.out.printf("Gender: %s\n", getGender());
        System.out.printf("Birth Year: %d\n", getBirthYear());
        System.out.printf("Age: %d\n", getAge());
        System.out.printf("Height (m): %.1f\n", getHeight());
        System.out.printf("Weight (kg): %.1f\n", getWeight());
        System.out.printf("Body Mass Index (BMI): %.1f\n", bmi);

        int maxHeartRate = maximumHeartRate(getBirthYear());
        int minTargetHeartRate = minTargetHeartRate(getBirthYear());
        int maxTargetHeartRate = maxTargetHeartRate(getBirthYear());

        System.out.printf("Maximum Heart Rate: %d bpm\n", maxHeartRate);
        System.out.printf("Target Heart Rate Range: %d - %d bpm\n", minTargetHeartRate, maxTargetHeartRate);

        // END CODE

        // You do not need to modify this piece of code, it is fine as it is.
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
       
    }}