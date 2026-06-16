package gcr_codebase.control_flow.Level1;

import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a Natural Number");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("For Loop Sum = " + sum);
        System.out.println("Formula Sum = " + formula);
        System.out.println("Both are equal: " + (sum == formula));
    }

}
