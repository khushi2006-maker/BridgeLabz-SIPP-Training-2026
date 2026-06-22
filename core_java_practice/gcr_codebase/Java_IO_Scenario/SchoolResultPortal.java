package gcr_codebase.Java_IO_Scenario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SchoolResultPortal {
    public static void main(String[] args) {

        try {
            BufferedReader br =   new BufferedReader(
                    new FileReader("core_java_practice/gcr_codebase/Java_IO_Scenario/students.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }


}
