// Create a method to find the sum of the first n natural numbers

import java.util.Scanner;
public class task7 {
public static void main(String[]args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int b = a.nextInt();

        int sum = b * (b + 1) / 2;

        System.out.println(sum);

        a.close();
    }
}


