package gcr_codebase.control_flow.Level2;

import java.util.Scanner;

public class MultiplesWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid Number");
            return;
        }

        int multiple = number;

        while (multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }
    }

}
