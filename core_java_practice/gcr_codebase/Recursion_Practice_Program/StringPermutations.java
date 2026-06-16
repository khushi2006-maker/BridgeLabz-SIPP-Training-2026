package gcr_codebase.Recursion_Practice_Program;

import java.util.Scanner;

public class StringPermutations {
    static void permute(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            String remaining =
                    str.substring(0, i) +
                            str.substring(i + 1);

            permute(remaining, result + current);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        permute(str, "");
    }
}
