import java.util.Scanner;
public class toggle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter String:- ");
            StringBuilder sb = new StringBuilder(sc.nextLine()); // phYSics

            for(int i=0;i<sb.length();i++){
                
                if(sb.charAt(i)==' ') continue;
                int ch =(int)sb.charAt(i);// create ASCII value of character;

                if(ch<97){ // if have upper case
                    ch+=32; // add 32 will make it ASCII value of lowecase
                    sb.setCharAt(i,(char)ch); // asign in StringBuilder
                } 
                else{ // if have lower case
                    ch-=32; // substract 32 will make it upper case;
                    sb.setCharAt(i,(char)ch); // assign the value of ch in form of character in stringBuilder
                }
            }

            System.out.println(sb);// print the result

        }
    }
}
