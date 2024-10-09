import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestGenerateGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask whether to generate random grades or manually input values
        System.out.println("Choose an option:");
        System.out.println("1. Generate random grades");
        System.out.println("2. Input your own grades");
        int choice = scanner.nextInt();

        int[] grades;
        int n;

        // Process the choice
        if (choice == 1) {
            // Generate random grades
            System.out.println("Enter the number of students:");
            n = scanner.nextInt();
            grades = generateRandomGrades(n);
            System.out.println("Randomly Generated Grades: " + Arrays.toString(grades));
        } else if (choice == 2) {
            // Input grades manually
            System.out.println("Enter the number of students:");
            n = scanner.nextInt();
            grades = new int[n];

            System.out.println("Enter the grades for " + n + " students (0-100):");
            System.out.println("If the values are invalid, then the program will end.");
            for (int i = 0; i < n; i++) {
                grades[i] = scanner.nextInt();
            }
            System.out.println("Manually Entered Grades: " + Arrays.toString(grades));
        } else {
            // Invalid option
            System.out.println("Exiting program.");
            return;
        }

        // Call the function to round the grades from GenerateGrades class
        int[] roundedGrades = GenerateGrades.generateGrades(grades, n);

        // Print the rounded grades
        System.out.println("Rounded Grades: " + Arrays.toString(roundedGrades));
    }

    // Function to generate random grades between 0 and 100
    public static int[] generateRandomGrades(int n) {
        Random random = new Random();
        int[] grades = new int[n];

        // Generate random numbers between 0 and 100 for each grade
        for (int i = 0; i < n; i++) {
            grades[i] = random.nextInt(101);  // Random number between 0 and 100
        }

        return grades;
    }
}
