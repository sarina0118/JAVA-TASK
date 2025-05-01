// Write a method to check if a number is a Kaprekar number
import java.util.Scanner;

public class task13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        String strSq = String.valueOf(square);

        int len = strSq.length();
        int left = 0, right = 0;

        if (len > 1) {
            left = Integer.parseInt(strSq.substring(0, len / 2));
            right = Integer.parseInt(strSq.substring(len / 2));
        } else {
            right = square;
        }

        if (left + right == num) {
            System.out.println(num + " is a Kaprekar Number.");
        } else {
            System.out.println(num + " is NOT a Kaprekar Number.");
        }

        sc.close();
    }
}
