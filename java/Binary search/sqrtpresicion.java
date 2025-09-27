import java.util.Scanner;

public class sqrtpresicion {
    static double sqrtWithPrecision(int num, int precision){
        int intPart = sqrt(num);
        double ans = intPart;
        double factor = 0.1;
    
        for(int i = 0; i < precision; i++) {
            while(ans * ans <= num) {
                ans += factor;
            }
            ans -= factor; // Step back to last valid
            factor /= 10;
        }
    
        return ans;
    }
    

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
            double ans = sqrtWithPrecision(num, 2);
            System.out.printf("Square root of %d:- %.2f",num,ans);

        }
    }
}
