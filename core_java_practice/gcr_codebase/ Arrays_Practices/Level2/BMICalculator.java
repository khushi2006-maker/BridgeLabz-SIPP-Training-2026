package Level2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Height (cm): ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {

            double h = height[i] / 100.0;

            bmi[i] = weight[i] / (h * h);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s%n",
                    height[i], weight[i], bmi[i], status[i]);
        }
    }
}
