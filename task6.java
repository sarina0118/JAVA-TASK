// Write a method to swap two numbers using a temporary variable
import java.util.Scanner;

public class task6 {
    public static void swap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println(" a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);

        sc.close();
    }

    public static void main(String[] args) {
        swap();
    }
}

    

