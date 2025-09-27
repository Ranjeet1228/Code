import java.util.Scanner;
public class RightTriangle{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking input for number of rows
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();

    sc.close();//to avoid memory leak

    // Handling invalid input
    if (rows <= 0) {
        System.out.println("Invalid input! Number of rows must be greater than 0.");
        return;
    }

    // Loop to print right-angled triangle
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println(); // for nextLine character
    }
}
}


    

