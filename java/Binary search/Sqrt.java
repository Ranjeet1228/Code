import java.util.Scanner;
public class Sqrt {

    // methode to find sqare root 
    static int sqrt(int num){
        int ans = -1; // to store result
        int st = 1, end = num;
        while(st<=end){
            int mid = st+(end - st)/2;
            long val = (long)mid*mid;
            if(val == num){ 
                ans = mid; // if ans is found exactly then return
                return ans; // return value of answer
            }
            else if(val > num){ // if val is greater then search in left side
                end = mid-1;
            } else if(val <num){ // if val is less then store it and search in right side
                ans = mid;
                st=mid+1;

            }
        }
        return ans; // return the value of ans
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number to find sqrt:- ");
            int num = sc.nextInt();
            int idx = sqrt(num);
            System.out.printf("Square root of %d:- %d",num,idx);

        }
    }
}