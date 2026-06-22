package gcr_codebase.Java_IO_Scenario;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        FileWriter fw = new FileWriter("expenses.txt", true);

        fw.write(category + " - " + amount + "\n");

        fw.close();

        System.out.println("Expense Saved Successfully");
    }
}