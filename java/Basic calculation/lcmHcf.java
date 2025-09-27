//To find LCM and HCF of two number

import java.util.Scanner;

public class lcmHcf {
    public static void main(String[] args) {
        //Scanner class object sc to store the value 
        Scanner sc= new Scanner(System.in);

        //prompt to enter first number 
        System.out.print("Enter first number:- ");
        int a=sc.nextInt();

        //prompt to enter second number
        System.out.print("Enter the second number:- ");
        int b=sc.nextInt();

        sc.close();//to prevent resource leak
        
        //store the value of a and b for further use
        int temp1=a;
        int temp2=b;
        
        //find the HCF of two number
        while(temp2>0){
            int temp=temp1%temp2;
            temp1=temp2;
            temp2=temp;
        }

        int lcm=(a*b)/temp1; //lcm of any two number = product of two number/HCF
        System.out.println("HCF of two number:- "+ temp1);
        System.out.println("LCM of two number:- "+lcm);
    }
    
}
