import java.util.Scanner;

public class fraction {

    // function to add two fraction
    public static Fraction add(Fraction f1, Fraction f2){
        int num = f1.num*f2.den + f2.num*f1.den;
        int den = f1.den*f2.den;
        Fraction f3 = new Fraction(num, den);
        return f3;
    }
    

    // function to find hcf
    public static int gcd(int num,int den){
        int min= Math.min(num,den);
        for(int i=min;i>=1;i--){
            if(den%i==0&&num%i==0) return i;
        }
        return 1;
    }

    // class to store fraction and simply them
    public static class Fraction{
        int num;
        int den;

        // constructor
        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }

        // simplify 
        public void simplify(){
            // find hcf
            int hcf = gcd(num,den);
            num/=hcf;
            den/= hcf;
        }
        
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter num/ den");
        Fraction f1 = new Fraction(sc.nextInt(), sc.nextInt());
        //System.out.println(f1.num+"/"+f1.den);

        System.out.println("Enter num2/den2");
        Fraction f2 = new Fraction(sc.nextInt(),sc.nextInt());
        //System.out.println(f2.num+"/"+f2.den);

        Fraction f3 = add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
        }
    }
}