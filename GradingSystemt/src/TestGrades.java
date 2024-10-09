import static org.junit.Assert.*;
import org.junit.Test;

public class TestGrades {

    // Test the generateGrades method
    @Test
    public void testGenerateGrades() {
        // Sample input grades
        int[] grades = {73, 67, 38, 33};
        int n = grades.length;
        
        // Expected output after rounding
        int[] expectedRoundedGrades = {75, 67, 40, 33};

        // Call the generateGrades method
        int[] roundedGrades = GenerateGrades.generateGrades(grades, n);
        
        // Make sure expected and actual rounded grades are equal
        assertArrayEquals(expectedRoundedGrades, roundedGrades);
    }
    
    @Test
    public void testFailingGrades() {
        // Sample input where grades less than 38
        int[] grades = {33, 29, 12};
        int n = grades.length;
        
        // Expected output: no rounding
        int[] expectedRoundedGrades = {33, 29, 12};

        // Call the generateGrades method
        int[] roundedGrades = GenerateGrades.generateGrades(grades, n);
        
        // Assert that the expected and actual rounded grades are equal
        assertArrayEquals(expectedRoundedGrades, roundedGrades);
    }
}
