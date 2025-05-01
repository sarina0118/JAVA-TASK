// Write a method to calculate the compound interest given principal, rate, and time
import java.util.Scanner;

public class task4 {
    public static void main() {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = a.nextDouble();

        System.out.print("Enter Rate of interest (in %): ");
        double rate = a.nextDouble();

        System.out.print("Enter Time (in years): ");
        int time = a.nextInt();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double interest = amount - principal;

        System.out.println("Compound Interest = " + interest);
        System.out.println("Total Amount = " + amount);

        a.close();
    }

    public static void main(String[] args) {
       main();
    }
}

