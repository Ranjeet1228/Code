import java.util.Scanner;

public class ToggleM2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter string:- ");
            StringBuilder sb = new StringBuilder(sc.nextLine());
            
            // loop to convert the uppercase to lowecase & lowercase to uppercase
            for(int i=0;i<sb.length();i++){
                char ch= sb.charAt(i); // obtain character at i

                if(ch>='A'&& ch<='Z'){ // if character is uppercase
                    // covert it into lowercase using implicit function
                    int asc = (int)ch;
                    asc+=32;
                    sb.setCharAt(i, (char)asc); // store the changed value in that place
                }
                else if(ch>='a'&&ch<='z'){ // if alphabet is in lower case
                    ///convered into uppercase by implicit function
                    int asc = (int)ch;
                    asc-=32;
                    sb.setCharAt(i, (char)asc);
                } // if the character is not alphaber then continue
            }

            System.out.println(sb);
        }
    }
}
