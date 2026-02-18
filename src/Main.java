import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String word = scanner.nextLine();

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Input text: " + word);

        if (word.equals(reversed)) {
            System.out.println("Is it a Palindrome? : true");
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("Is it a Palindrome? : false");
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
