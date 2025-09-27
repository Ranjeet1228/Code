public class StudentClass {

    // creating a class which store data of student

    // public static class Student{ // here student is class 
    //     String name;
    //     int rollNO;
    //     double percent;
    // }

    public static void main(String[] arr){
         student s1 = new student(); // initialization of Student class with object x
        s1.name="Ranjeet Upadhyay";
       // s1.rollNO = 14;
        s1.percent = 32;
        System.out.println(s1.name);
      //  System.out.println(s1.rollNO);
      //   s1.rollNO = 15;
        s1.setRoll(14); // setter function to set the value of private attribute
        
        System.out.println(s1.getRno()); // getter funtion to get value 
        System.out.println(s1.percent);
    }
}
