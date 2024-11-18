//Niccole Vorobiov 
// This is a Junit test that tests the calculateBMI method from MyHealthDataBase.java.
// I then created another method which is the incorrectBMI() method which uses different math.
// instead of the weight multiplying by 703 i changed it to 123,
// and instead of the height multiplying by the height, i made it
// the height multiplying by the weight.

package assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyHealthDataTest2 {
    private static final double EPSILON = 1E-12;

    @Test
    public void testCalculateBMI() {
        MyHealthData testPatient = new MyHealthData("harry", "jackson", "male", 1990, 67.0, 175);
        
        // Calculate BMI using the method
        double result = testPatient.calculateBMI(testPatient.getWeight(), testPatient.getHeight());

        // Expected BMI value calculated from the known formula
        double expected = 27.4;

        assertEquals(expected, result, EPSILON);
    }

    @Test
	public void testIncorrectBMI() {
		MyHealthData testPatient2 = new MyHealthData("birdy", "shines", "female", 1995, 67.0, 175);
        
        // Calculate BMI using the method
        double result = testPatient2.incorrectBMI(testPatient2.getWeight(), testPatient2.getHeight());

        // Expected BMI value calculated from the known formula
        double expected = 27.4;

        assertEquals(expected, result, EPSILON);
	}
	}
