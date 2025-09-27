
public class basicst {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        //str.setCharAt(2, 'a');// change at 2 index of str 
        //System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        
    }
}
