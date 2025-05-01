// Create a method to reverse an integer number without converting it to a string
import java.util.Scanner;

public class task14 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
        int num = sc.nextInt();
 int reversed = 0;
while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
System.out.println("Reversed number: " + reversed);
sc.close();
    }
}
