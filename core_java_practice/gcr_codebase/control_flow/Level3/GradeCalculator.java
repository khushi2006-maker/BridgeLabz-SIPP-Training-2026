package gcr_codebase.control_flow.Level3;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Physics: ");
        int phy = sc.nextInt();

        System.out.print("Chemistry: ");
        int chem = sc.nextInt();

        System.out.print("Maths: ");
        int maths = sc.nextInt();

        double percentage = (phy + chem + maths) / 3.0;

        System.out.println("Percentage = " + percentage);

        if (percentage >= 90)
            System.out.println("Grade A+");
        else if (percentage >= 80)
            System.out.println("Grade A");
        else if (percentage >= 70)
            System.out.println("Grade B");
        else if (percentage >= 60)
            System.out.println("Grade C");
        else if (percentage >= 40)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }
}
