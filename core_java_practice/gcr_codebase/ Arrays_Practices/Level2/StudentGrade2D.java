package Level2;

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];

        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {

            percentage[i] =
                    (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1)
                    + " Percentage = " + percentage[i]
                    + " Grade = " + grade[i]);
        }
    }
}
