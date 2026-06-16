package gcr_codebase.control_flow.Level2;

import java.util.Scanner;

public class FriendDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amar Age: ");
        int amarAge = sc.nextInt();
        System.out.print("Amar Height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Akbar Age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Akbar Height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Anthony Age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Anthony Height: ");
        double anthonyHeight = sc.nextDouble();

        String youngest = "Amar";
        int minAge = amarAge;

        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }

        if (anthonyAge < minAge) {
            youngest = "Anthony";
        }

        String tallest = "Amar";
        double maxHeight = amarHeight;

        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }

        if (anthonyHeight > maxHeight) {
            tallest = "Anthony";
        }

        System.out.println("Youngest Friend = " + youngest);
        System.out.println("Tallest Friend = " + tallest);
    }
}
