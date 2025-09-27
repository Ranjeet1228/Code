import java.util.*;

public class AnagramM2 {

    public static  boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i =0;i<s.length();i++){

            Character ch = s.charAt(i);

            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int freq= mp.get(ch);
                mp.put(ch,++freq);
            }
        }

        for(int i =0;i<t.length();i++){

            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;

            int currFreq = mp.get(ch);
            if(currFreq==0) return false;

            mp.put(ch,--currFreq);
        }

        for(Integer i : mp.values()){
            if(i!=0)return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter first word:- ");
            String str1 = sc.next();

            System.out.print("Enter the second word:- ");
            String str2 = sc.next();

            System.out.println("Both string are anagram:-? "+ isAnagram(str1, str2));
        }
    }
}
