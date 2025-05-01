// Write a method to generate the first n terms of the Fibonacci series
import java.util.Scanner;

public class task15 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
 int a = 0, b = 1;
System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
