package Problem47;

import java.util.Scanner;

public class AppendStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        scanner.close();

        String result = appendStrings(str1, str2);
        System.out.println("Resulting string: " + result);
    }

    public static String appendStrings(String str1, String str2) {
        if (str1.length() > str2.length()) {
            str1 = str1.substring(str1.length() - str2.length());
        } else if (str2.length() > str1.length()) {
            str2 = str2.substring(str2.length() - str1.length());
        }
        return str1 +" "+ str2;
    }
}

