import java.util.*;

public class isomorphic {

    public static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character s1 = s.charAt(i);
            Character s2 = t.charAt(i);
            if(!mp.containsKey(s1) && !mp.containsValue(s2)){
                mp.put(s1, s2);
            }else if(s2 != mp.get(s1)) return false;
            
        }
        return true;
    }

    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter an string:- ");
            String st1= sc.next();

            System.out.print("Enter second String:- ");
            String st2 = sc.next();

            System.out.println("isomorphhic:- "+isIsomorphic(st1, st2));

        }
    }
}
