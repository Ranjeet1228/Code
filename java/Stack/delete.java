import java.util.Scanner;
import java.util.Stack;

public class delete {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            Stack<Integer> st = new Stack<>();
            Stack<Integer> tem = new Stack<>();

            System.out.print("Enter length:- ");
            int n = sc.nextInt();

            //enter element
            System.out.println("Enter element of Stack:- ");
            for(int i=0;i<n;i++){
                st.push(sc.nextInt());
            }

            System.out.println("Enter index to be deleted:- ");
            int idx= sc.nextInt();

            // error case handling
            if(idx<0||idx>=st.size()){
                System.out.println("Out of index");
                return;
            }

            int size = st.size();
            while(size>idx+1){
                tem.push(st.pop());
                size--;
            }
            st.pop();
            while(!tem.isEmpty()){
                st.push(tem.pop());
            }

            System.out.println(st);
        }
    }
    
}
