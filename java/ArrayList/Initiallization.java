import java.util.ArrayList;

public class Initiallization {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        //Insert the value in arraylist
        list.add(2); //0th ArrayList
        list.add(3); //1st Arraylist
        list.add(5); //2nd Arraylist
        list.add(56);//3rd Arraylist
        System.out.print(list.get(0)+" ");
        System.out.print(list.get(1)+" ");
        System.out.print(list.get(2)+" ");
        System.out.print(list.get(3)+" ");
        System.out.println();
        for(int i=0;i<4;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //print ArrayList directly
        System.out.println(list);
        //add element at some index
        list.add(1,10);//it will add 10 at 1st indices new ArrayList= [2,10,3,5,56]
        System.out.println("after addidng"+ list);
        System.out.println();

        //update element of any index
        list.set(1,100); //it will modify number of index1 with 100. new ArryList will be [2,100,3,5,56]
        System.out.println("after upadate:- "+list);
        System.out.println();

        //remove element of ArrayList
        list.remove(1);//remove the element of index 1
        System.out.println("after removing:- "+list);
        System.out.println();

        //remove elemt e even if we do not know index 
        list.remove(Integer.valueOf(56));
        System.out.println("after removing 56:- "+ list);
        System.out.println();

        //check and remove both should be take place
        System.out.println(list.remove(Integer.valueOf(2))); //it will check either numberr is present or not in case of present it true and remove that number if not print false
        System.out.println(list);
        System.out.println();

        //check element is present or not
        boolean ans = list.contains(Integer.valueOf(5));
        System.out.println(ans);
        System.out.println(list);
        System.out.println();
            

        //if we do not specify the class then we can store any data type inside it
        System.out.println("special list ");
        ArrayList <Object>list1 = new ArrayList <>();
        list1.add(1);
        list1.add(2.30);
        list1.add("Ranjeet");
        list1.add(true);
        System.out.println(list1);
    }
    
}
