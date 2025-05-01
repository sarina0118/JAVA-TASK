// Write a method to print all odd numbers from 1 to a given number n
import java.util.Scanner;
public class task{
    public static void main(String[]args){
        Scanner a = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int b = a.nextInt();
        for(int i=1;i<=b;i++){
            if (i%2!=0){
                System.out.println(i);
            
            }
        }
    a.close();
    }
}