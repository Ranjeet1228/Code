import java.util.Scanner;

public class basic {
	public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter a string:- ");// Ranjeet
            String str= sc.nextLine();
            System.out.print("Enter another string:- "); // Manjeet
            String str1 = sc.nextLine();
            System.out.println("charcter at 2:- "+str.charAt(2));// print the character present at indext 2
            System.out.println("Length of str:- "+str.length()); // use to print length of str
            System.out.println("Index of a:- "+str.indexOf('a'));// print the index at which a is present
            System.out.println(str.compareTo(str1)); // it give 0 for equal      str>str1 give +ve      str<str1 give -ve according to lexicography
            System.out.println(str.contains("Ran")); // it give boolean result
            System.out.println(str.startsWith("R"));
            System.out.println(str.endsWith("t"));
            System.out.println(str.concat(str1)); // add two string
            System.out.println(str.toUpperCase());//convert into upper case
            System.out.println(str1.toLowerCase()); // convert into lower case
        }
		//System.out.println("Hello, world!");

	}
}
