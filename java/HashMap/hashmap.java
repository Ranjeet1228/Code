import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        
        // Map<String,Integer> mp = new HashMap<>();
        HashMap<String,Integer> mp = new HashMap<>();

        
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        System.out.println(mp.get("Akash"));
        System.out.println(mp.get("Ranjeet")); // no key of ranjeet exist so it return null
        
        // changing and updating
        mp.put("Akash",25);
        System.out.println(mp.get("Akash")); 

        // remove a keypair
        System.out.println(mp.remove("Lav")); //17
        System.out.println(mp.get("Lav")); 

        //checking if a key is in the hashmap
        System.out.println(mp.containsKey("Akash")); // true
        System.out.println(mp.containsKey("Lav")); // false

        //Adding new entry if the new key does not exist already
        mp.putIfAbsent("Ranjeet", 21);
        mp.putIfAbsent("Rishika", 25); // rishika is present so it will not update 

        //getting all key in hashmap
        System.out.println(mp.keySet()); 

        //get all value in hashmap
        System.out.println(mp.values()); 

        ///get all entries in hasmap
        System.out.println(mp.entrySet()); 

        //traversing all entries of Hashmap- multiple methods
        for(String key: mp.keySet()){
          System.out.printf("Age of %s is %d\n", key,mp.get(key));
        }
        // or  
        System.out.println();
        for(Map.Entry<String,Integer> e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();

        //or
        for(var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}
