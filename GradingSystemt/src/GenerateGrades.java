public class GenerateGrades {

    // Method to generate the rounded grades
    public static int[] generateGrades(int[] grades, int n) {
        // Create an array to store the rounded grades
        int[] roundedGrades = new int[n];
        
        // Loop through each grade
        for (int i = 0; i < n; i++) {
            int grade = grades[i];
            
            // Check if rounding is needed (grades >= 38 and within 3 of next multiple of 5)
            if (grade >= 38 && grade % 5 >= 3) {
                // Round up to the nearest multiple of 5
                grade = grade + (5 - (grade % 5));
            }
            
            // Store the rounded grade in the array
            roundedGrades[i] = grade;
        }
        
        // Return the array of rounded grades
        return roundedGrades;
    }
}
