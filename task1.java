// Create a method to convert a given number of days into years, months, and days
import java.util.Scanner;
public class task1{
    public static void main(String[]args){
        Scanner a= new Scanner(System.in);
        System.out.println("Enter number of days:");
        int b =a.nextInt();
        int years = (b/365);
        int months = (b%365)/30;
        int days=(b%365%30);

        System.out.println("years:"+years+"months:"+months+"days:"+days);
        a.close();

    }
}

