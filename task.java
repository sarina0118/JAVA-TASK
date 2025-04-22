// Write a Java program to input your full name and print a greeting message.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         // Create a Scanner object to read input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter their full name
//         System.out.print("Enter your full name: ");
//         String fullName = scanner.nextLine(); // Read the full name

//         // Print a greeting message
//         System.out.println("Hello, " + fullName + "! Welcome!");
        
//         // Close the scanner
//         scanner.close();
//     }
// }

// Take two numbers as input and print their sum, difference, product, and quotient.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         // Create a Scanner object to read input
//         Scanner scanner = new Scanner(System.in);

//         // Input two numbers
//         System.out.print("Enter the first number: ");
//         double num1 = scanner.nextDouble();

//         System.out.print("Enter the second number: ");
//         double num2 = scanner.nextDouble();

//         // Perform calculations
//         double sum = num1 + num2;
//         double difference = num1 - num2;
//         double product = num1 * num2;
//         double quotient = (num2 != 0) ? (num1 / num2) : Double.NaN; // Handle divide by zero

//         // Print the results
//         System.out.println("Sum: " + sum);
//         System.out.println("Difference: " + difference);
//         System.out.println("Product: " + product);
//         if (num2 != 0) {
//             System.out.println("Quotient: " + quotient);
//         } else {
//             System.out.println("Quotient: Undefined (division by zero)");
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }

// Write a program to check whether a given number is positive, negative, or zero using if-else.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         // Create Scanner object to read input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt user to enter a number
//         System.out.print("Enter a number: ");
//         double number = scanner.nextDouble();

//         // Check if the number is positive, negative, or zero
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }

// Write a program that takes a number and checks if it is divisible by both 5 and 11
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         // Create Scanner object to read input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt user to enter a number
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         // Check if the number is divisible by both 5 and 11
//         if (number % 5 == 0 && number % 11 == 0) {
//             System.out.println(number + " is divisible by both 5 and 11.");
//         } else {
//             System.out.println(number + " is NOT divisible by both 5 and 11.");
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }

// Take a number from the user and print whether it is even or odd.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         if (number % 2 == 0)
//             System.out.println("Even");
//         else
//             System.out.println("Odd");

//         scanner.close();
//     }
// }

// Input the age of a person and check if they are eligible to vote (18 or older).
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter age: ");
//         int age = scanner.nextInt();

//         if (age >= 18)
//             System.out.println("Eligible to vote.");
//         else
//             System.out.println("Not eligible to vote.");

//         scanner.close();
//     }
// }

// Write a program to input a character and check if it is a vowel or a consonant using if-else.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = scanner.next().toLowerCase().charAt(0);

//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//             System.out.println("Vowel");
//         else
//             System.out.println("Consonant");

//         scanner.close();
//     }
// }

// Take marks of five subjects and calculate the total, percentage, and grade using if-else.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int total = 0;
//         for (int i = 1; i <= 5; i++) {
//             System.out.print("Enter marks for subject " + i + ": ");
//             total += scanner.nextInt();
//         }

//         double percentage = total / 5.0;
//         char grade;

//         if (percentage >= 90) grade = 'A';
//         else if (percentage >= 80) grade = 'B';
//         else if (percentage >= 70) grade = 'C';
//         else if (percentage >= 60) grade = 'D';
//         else grade = 'F';

//         System.out.println("Total = " + total);
//         System.out.println("Percentage = " + percentage + "%");
//         System.out.println("Grade = " + grade);

//         scanner.close();
//     }
// }

// Write a program to take a number from the user and print whether it is a leap year or not.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();

//         if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
//             System.out.println("Leap year");
//         else
//             System.out.println("Not a leap year");

//         scanner.close();
//     }
// }

// Input a number from the user and display whether it is a prime number using a for loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         boolean isPrime = true;

//         if (number <= 1) isPrime = false;
//         else {
//             for (int i = 2; i <= number / 2; i++) {
//                 if (number % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime)
//             System.out.println("Prime number");
//         else
//             System.out.println("Not a prime number");

//         scanner.close();
//     }
// }

// Write a program to print the multiplication table of a given number using for loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " x " + i + " = " + (num * i));
//         }

//         scanner.close();
//     }
// }

// Take a number n and print the sum of first n natural numbers using a loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = scanner.nextInt();
//         int sum = 0;

//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }

//         System.out.println("Sum = " + sum);
//         scanner.close();
//     }
// }

// Write a program that prints all even numbers from 1 to 100 using for loop.
// public class task {
//     public static void main(String[] args) {
//         for (int i = 2; i <= 100; i += 2) {
//             System.out.print(i + " ");
//         }
//     }
// }

// Input a number and display the factorial of that number using a for loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         long fact = 1;

//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }

//         System.out.println("Factorial = " + fact);
//         scanner.close();
//     }
// }

// Take two numbers and an operator (+, -, *, /) and perform the operation using switch.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double num1 = scanner.nextDouble();
//         System.out.print("Enter second number: ");
//         double num2 = scanner.nextDouble();
//         System.out.print("Enter operator (+, -, *, /): ");
//         char op = scanner.next().charAt(0);

//         switch (op) {
//             case '+': System.out.println("Result = " + (num1 + num2)); break;
//             case '-': System.out.println("Result = " + (num1 - num2)); break;
//             case '*': System.out.println("Result = " + (num1 * num2)); break;
//             case '/':
//                 if (num2 != 0)
//                     System.out.println("Result = " + (num1 / num2));
//                 else
//                     System.out.println("Cannot divide by zero");
//                 break;
//             default: System.out.println("Invalid operator");
//         }

//         scanner.close();
//     }
// }

// Write a program to input a number from 1 to 7 and display the day of the week using switch.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number (1 to 7): ");
//         int day = scanner.nextInt();

//         switch (day) {
//             case 1: System.out.println("Sunday"); break;
//             case 2: System.out.println("Monday"); break;
//             case 3: System.out.println("Tuesday"); break;
//             case 4: System.out.println("Wednesday"); break;
//             case 5: System.out.println("Thursday"); break;
//             case 6: System.out.println("Friday"); break;
//             case 7: System.out.println("Saturday"); break;
//             default: System.out.println("Invalid input");
//         }

//         scanner.close();
//     }
// }

// Input a month number (1–12) and print the number of days in that month using switch.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter month number (1-12): ");
//         int month = scanner.nextInt();

//         switch (month) {
//             case 1, 3, 5, 7, 8, 10, 12:
//                 System.out.println("31 days");
//                 break;
//             case 4, 6, 9, 11:
//                 System.out.println("30 days");
//                 break;
//             case 2:
//                 System.out.println("28 or 29 days");
//                 break;
//             default:
//                 System.out.println("Invalid month number");
//         }

//         scanner.close();
//     }
// }

// Take a character input and use switch to display if it is a vowel (a, e, i, o, u).
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = scanner.next().toLowerCase().charAt(0);

//         switch (ch) {
//             case 'a', 'e', 'i', 'o', 'u':
//                 System.out.println("Vowel");
//                 break;
//             default:
//                 System.out.println("Not a vowel");
//         }

//         scanner.close();
//     }
// }

// Input a number and check if it is a perfect square using for loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         boolean isPerfect = false;

//         for (int i = 1; i * i <= num; i++) {
//             if (i * i == num) {
//                 isPerfect = true;
//                 break;
//             }
//         }

//         if (isPerfect)
//             System.out.println("Perfect square");
//         else
//             System.out.println("Not a perfect square");

//         scanner.close();
//     }
// }

// Write a program to find the sum of digits of a number using a loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         int sum = 0;

//         while (num != 0) {
//             sum += num % 10;
//             num /= 10;
//         }

//         System.out.println("Sum of digits = " + sum);
//         scanner.close();
//     }
// }

// Input a number and reverse it using a for loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         int reversed = 0;

//         while (num != 0) {
//             reversed = reversed * 10 + num % 10;
//             num /= 10;
//         }

//         System.out.println("Reversed number = " + reversed);
//         scanner.close();
//     }
// }

// Take a number and check whether it is a palindrome or not using if-else and loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         int original = num, reversed = 0;

//         while (num != 0) {
//             reversed = reversed * 10 + num % 10;
//             num /= 10;
//         }

//         if (original == reversed)
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not a palindrome");

//         scanner.close();
//     }
// }

// Input n and print the first n terms of the Fibonacci series.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of terms: ");
//         int n = scanner.nextInt();

//         int a = 0, b = 1;
//         System.out.print("Fibonacci series: ");
//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int sum = a + b;
//             a = b;
//             b = sum;
//         }

//         scanner.close();
//     }
// }

// Write a program to count how many digits are in a given number using a loop.
// import java.util.Scanner;

// public class task {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         int count = 0;

//         if (num == 0) count = 1;
//         while (num != 0) {
//             count++;
//             num /= 10;
//         }

//         System.out.println("Number of digits = " + count);
//         scanner.close();
//     }
// }
