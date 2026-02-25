import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String word = scanner.nextLine();

        System.out.println("Input text: " + word);

        if (isPalindrome(word)) {
            System.out.println("Is it a Palindrome? : true");
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("Is it a Palindrome? : false");
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String s) {
        char[] string = s.toCharArray();
        int low = 0, high = string.length - 1;
        while (low <= high) {
            if (string[low] != string[high]) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static boolean isPalindromeStack(String s){
        boolean result=true;
        Stack<Character> charStack=new Stack<>();
        char[] charArray = s.toCharArray();
        int i=0;
        for(char c : charArray){
            charStack.push(c);
        }
        while(i<charArray.length){
            if(charStack.pop()!= charArray[i]){
                result=false;
            }
            i++;
        }
        return result;
    }
}
