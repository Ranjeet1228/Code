package java.Recursion;
import java.util.Scanner;

public class keypadCombination {
    // Recursive function to print all combinations of characters for a given digit string
    public static void combination(String dig, String[] kp, String rem) {
        if (dig.length() == 0) { // Base case
            System.out.print(rem + " "); // Print the result
            return;
        }

        // convert first digit 'dig' from string into integer value
        int currNum = dig.charAt(0) - '0';

        // access the string stored at that index in kp
        String currChoices = kp[currNum];

        // Loop through each character mapped to the current digit
        for (int i = 0; i < currChoices.length(); i++) {
            // Recursive call with the remaining digits and current character appended to the result
            combination(dig.substring(1), kp, rem + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Prompt the user to enter a digit string
            System.out.print("Enter string:- ");
            String s = sc.nextLine();

            // Array mapping digits to corresponding characters like on a phone keypad
            String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            //             0   1   2     3     4     5     6     7     8      9

            // Call the recursive function with the user input and an empty string for accumulating results
            combination(s, kp, "");
        }
    }
    
}