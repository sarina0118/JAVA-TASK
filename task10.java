// Write a method to determine if a number is a Duck number
import java.util.Scanner;

public class task10 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
        String numStr = sc.nextLine();
     if (numStr.charAt(0) == '0') {
            System.out.println("Not a Duck Number (starts with 0)");
        } else if (numStr.contains("0")) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
       sc.close();
    }
}
