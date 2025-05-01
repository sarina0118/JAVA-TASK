// Create a method to calculate the cube of a given number
import java.util.Scanner;
public class task9 {
     public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
        int num = sc.nextInt();
int cube = num * num * num;
System.out.println("Cube of " + num + " is: " + cube);
 sc.close();
    }
}
