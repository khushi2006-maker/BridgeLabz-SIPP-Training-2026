package gcr_codebase.control_flow.Level2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Number");
            return;
        }

        int i = 1;

        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    }