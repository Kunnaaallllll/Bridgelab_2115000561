import java.util.Random;

public class StudentScores {

    public static void main(String[] args) {
        int numStudents = 5;

        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateResults(scores);

        displayScorecard(results);
    }

    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(81) + 20;
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][5];

        for (int i = 0; i < numStudents; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }

            double average = total / 3;
            double percentage = (total / 300) * 100;

            String grade = assignGrade(percentage);

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
            results[i][3] = grade.equals("A") ? 80 : grade.equals("B") ? 70 : grade.equals("C") ? 60 : grade.equals("D") ? 50 : grade.equals("E") ? 40 : 39;
            results[i][4] = grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("E") ? 100 : 39 ;
        }

        return results;
    }

    public static String assignGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "Remedial";
        }
    }

    public static void displayScorecard(double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < results.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(results[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
