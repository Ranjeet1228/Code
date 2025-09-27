import java.util.Scanner;
public class armstromg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);//Initiallize scanner class object to store data

        //promt to enter a number
        System.out.print("Enter a number:- ");
        int n=sc.nextInt();//store the value of n;

        //find total number in the given digit
        int count=0; //It store the total digit in a numbers
        int original=n;  //variable original store the value of n so that the value of n does not change
        while(original>0){
            original=original/10;
            count++;
        }

        int sum=0;

        //check the condition of number 
        int temp=n;//dtore the value of n in temp variable for further use of n 
        while(temp>0){
            int v=temp%10;
            sum+=Math.pow(v,count);
            temp=temp/10;
        }

        //if sum is equal to n then its a armstrong number
        if(sum==n){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");

        }
        sc.close();

    }
}
