import java.util.*;
public class Anagram {
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int i =0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            } else{
                int currFreq = mp.get(ch);
                mp.put(ch,++currFreq);
            }
        }
        return mp;
    }
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp1 = makeFreqMap(s);
        HashMap<Character,Integer> mp2 = makeFreqMap(t);

        return mp1.equals(mp2) ;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter first word:- ");
            String str1 = sc.next();

            System.out.print("Enter the second word:- ");
            String str2 = sc.next();

            System.out.println(isAnagram(str1,str2));
            
        }
    }
}
