import java.util.Scanner;

public class togglea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter an string;- ");
            String str=sc.nextLine();

            String st = ""; // create an empty string which store value

            for(int i=0;i<str.length();i++){
                int asc = (int)(str.charAt(i));// find ASCII value

                // Lower case
                if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
                    st+=((char)(asc-32));
                }
                // if Upper case 
                else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                    st+= ((char)(asc+32));
                }
                 else st+=str.charAt(i); // add simply;
            }

            System.out.println(st);
        }
    }
}
