
import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            //prompt the user to enter no of element in fruit
            System.out.print("Enter no of fruit:- ");
            int size = sc.nextInt();

            String[] fruit = new String[size];

            //prompt the user to enter fruit name
            System.out.println("Enter name of fruit:- ");
            for(int i= 0;i<size;i++){
                fruit[i] = sc.next();
            }

            //sort the name of fruit
            for(int i=0;i<size-1;i++){
                boolean flag= false;
                for(int j=0;j<size-1-i;j++){
                    if(fruit[j].compareTo(fruit[j+1])>0){
                        flag = true;
                        String swap =fruit[j];
                        fruit[j]=fruit[j+1];
                        fruit[j+1]=swap;
                    }
                }
                if(!flag) break; //if no swaping happen it means it is already sorted
            }
            System.out.print("After sorting name of fruit in lexicographical order:- ");
            for(String a: fruit){
                System.out.print(a+" ");
            }
        }
    }
    
}

