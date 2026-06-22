package gcr_codebase.Java_IO_Scenario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GroceryBillReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("bill.txt"));

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            count++;
        }

        br.close();

        System.out.println("Total Lines = " + count);
    }


}
