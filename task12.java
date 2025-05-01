// Write a method that returns the sum of squares of digits of a number
    import java.util.Scanner;
    public class task12 {
        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int sum = 0, digit;
            int temp = num;
  while (temp != 0) {
                digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
    System.out.println("Sum of squares of digits of " + num + " is: " + sum);
    
            sc.close();
        }
        }
    
     

