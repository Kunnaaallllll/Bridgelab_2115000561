import java.util.Scanner;

public class TeamBMI {

    public static double calculateBMI(double weight, double height) {
        height = height / 100;  // Convert height from cm to meters
        return weight / (height * height);  // BMI formula
    }

    public static String determineStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // 10 members, 3 columns (weight, height, BMI)
        String[] statuses = new String[10]; // To store BMI status for each member

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter weight (in kg): ");
            teamData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (in cm): ");
            teamData[i][1] = scanner.nextDouble();

            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]);  // Calculate BMI for each person
            statuses[i] = determineStatus(teamData[i][2]);  // Determine BMI status
        }

        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI    | Status");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %.2f        | %.2f         | %.2f   | %s\n", i + 1, teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }

        scanner.close();
    }
}
