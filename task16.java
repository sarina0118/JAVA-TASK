// Create a method that accepts a character and returns its ASCII value
import java.util.Scanner;

public class task16{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter a character: ");
char ch = sc.next().charAt(0); 
int ascii = (int) ch;
System.out.println("ASCII value of '" + ch + "' is: " + ascii);
sc.close();
    }
}
