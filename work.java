// public class work {
//     public static void main (String[] args){
//         int age =28;
//        String val=(age>5)? "Greater":"Smaller" ;
//         System.out.println(val);
//     }
// }

// public class work{
//     public static void main (String[] args){
//         int principle_Amount = 2000;
//         int Time = 40;
//         int Rate = 2;
//         int  Formula = (principle_Amount * Time * Rate)/100;
//         System.out.println(Formula);
//     }
//  }
// We can do it double but float ko value halda paxadi f halnu parxah.

// import java.util.Scanner;
// public class work{
//     public static void main (String[] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter your age:");
//         int age =sc.nextInt();
//         System.out.println("Your age is: "+age);
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class work{
//     public static void main (String[] args){
//         Scanner sc = new Scanner (System.in);

//         // Triangular area
//         System.out.println("Enter base of triangle:");
//         double base = sc.nextDouble();
//         System.out.println("Enter height of triangle:");
//         double height = sc.nextDouble();
//         double triangulararea = 0.5* base * height;
//         System.out.println("triangulararea: "+triangulararea);
        

//         // volume of cuboid
//         System.out.println("Enter length of cuboid:");
//         double length = sc.nextDouble();
//         System.out.println("Enter width of cuboid:");
//         double width = sc.nextDouble();
//         System.out.println("Enter height of cuboid:");
//         double Height = sc.nextDouble();
//         double cuboid = length*width*Height;
//         System.out.println("volume of cuboid: "+cuboid);
        
//         // Voulme of cube
//         System.out.println("Enter side of cube:");
//         double side = sc.nextDouble();
//         double cube= side*side*side;
//         System.out.println("volume of cube:"+cube);
//         sc.close();
//     }
// }

// if-elseif
// public class work{
//     public static void main(String[] args){
//         int age =21;
//         if (age>18){
//             System.out.println("You can vote.");
//         }else{
//             System.out.println("You can vote");
//         }
//         if (age>=21){
//             System.out.println("You are 21 or over");
//         }else if (age>=18){
//             System.out.println("You are 18 or over but not 21");
//         }else{
//            System.out.println("You are smaller than 18");
//         }
//     }
// }

// nested if
// int a=5;
// int b=10;
// int c=3;
// if (a>b){
//     if (a>c){
//         System.out.println("a+ is the highest number");
//     }
// }else{
//     if(b>c){
//         System.out.println("b+ is the highest number");
//     }
// }else {
//      System.put.println("c+ is the highest number");
// }

// import java.util.Scanner
// public class work{
//     public static void main (String[] args){
//         Scanner sc=new Scanner (System.in);
//         System.out.print("Enter the first number");
//         int a = sc.nextInt();
//         System.out.print("Enter second number");
//         int b = sc.nextInt();
//         System.out.print("Enter third number");
//         int c = sc.nextInt();
//         String name = sc.nextLine();
//         sc.close();
//         if (a>b){
//         if (a>c){
//         System.out.println("a+ is the highest number");
//     }
// }else{
//     if(b>c){
//         System.out.println("b+ is the highest number");
//     }
// }else {
//      System.out.println("c+ is the highest number");
// }
//     }
// }

// String day="Sunday";
// switch (day){
//     case "Sunday":
//        System.out.println("First day of week");
//        break;
//     case "Monday":
//     System.out.println("Second day of week");
//     break;
//     default:
//     System.out.println("Some other day of the week");
// }

// public class work{
//     public static void main(String[]args){
//         int a=1;
//         if (a>0){
//             System.out.println("positive");
//         }else if (a<0){
//             System.out.println("Negative");
//         }else{
//             System.out.println("Zero");
//         }
//     }
// }

// public class work{
//     public static void main(String[]args){
//         int a=10;
//         int b=20;
//         int c=30;
//         if (a>b && a>c){
//             System.out.println("A is greatest");
//         }else if (b>a && b>c) {
//             System.out.println("B is the greatest");
//         }else{
//             System.out.println("C is the greatest");
//         }
//     }
// }

// public class work{
//     public static void main(String[] args){
//         int a=55;
//         if (a%5==0 && a%11==0){
//             System.out.println("It is divisible");
//         }else{
//             System.out.println("It is not divisible");
//         }
//     }
// }

// public class work{
//     public static void main(String[]args){
//         int a=7;
//         if (a%2==0) {
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//     }
// }

// public class work{
//     public static void main(String[]args){
//         int year=2024;
//         if(year%100!=0 || year%400==0){
//             System.out.println("is a leap year");
//         }else{
//             System.out.println("not a leap year");
//         }
//     }
// }

// import java.util.Scanner;
// public class work{
//     public static void main(String[]args){
//         Scanner input= new Scanner(System.in);
//         System.out.print("Enter the letter ");
//         char letter = input.next().charAt(0);
//         if (letter =='a'|| letter=='e'||letter=='i'||letter=='o'||letter=='u'){
//             System.out.println("It is vowel");
//         }else {
//             System.out.println("It is consonent");
//         }
//     }
// }

// public class work{
//     public static void main(String[] args){
//         int i =5;
//         int sum=6 + i++;
//         System.out.println("Sum "+sum);
//         int k =5;
//         int sum1=6+ ++k;
//         System.out.println("SUM1 " +sum1);
//     }
// }

// String name="MyName";
// String name1= new String("MyName");
// String name2= name+name2;
// String name3=name.concat(name2);

// char val=name.charAt(1);   //extract a character by index from string
// System.out.println(name.length());  // prints the length of the string
// String value = name.substring(1,4);  //using slicing method
// System.out.println("Substring:"+ value);
// System.out.println(name.equals(anObject:"myname"));
// System.out.println(name.equalsIgnoreCase(anotherString:"myname"));
// name.contains("Name");
// name.startsWith("My");
// name.endsWith("e");
// name.indexOf("m");
// name.lastIndexOf("n");
// name.toLowerCase();
// name.toUpperCase();
// String val1 = "Hello ".trim();
// name.replace('a','b');
// String stringToSplit="abc.def.ghi";
// String[] seq = stringToSplit.split(".");
// int number =1;
// String numString = String.valueOf(number);

// import java.util.Scanner;
//  class work{
//     public static void main(String[] args) {
//       //initialize variavle;check condition;change variable value
//       for(int i=0;i<0;i++){
//         //Statements to be repeated until the condition is false
//         System.out.println(i);
//       } 
//       for(int a=1;a<11;a++){
//         for(int b=0;a<=b;b++){
//             System.out.println(b);
//         }
//       } 
//     }
// }

// Multiplication table from 1 to 10
// public class work {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Multiplication Table for " + i);
//             for (int j = 1; j <= 10; j++) {
//                 System.out.println(i + " x " + j + " = " + (i * j));
//             }
//             System.out.println(); // Print a blank line between tables
//         }
//     }
// }

// Take input from user and print sum from 1 to that number
// import java.util.Scanner;

// public class work{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         int sum = 0;
//         for (int i = 1; i <= number; i++) {
//             sum += i;
//         }

//         System.out.println("Sum from 1 to " + number + " is: " + sum);
        
//         scanner.close();
//     }
// }

// print even number from 1 to 100
// public class work{
//     public static void main(String[] args) {
//         System.out.println("Even numbers from 1 to 100:");

//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// take string input and reverse it
// import java.util.Scanner;

// public class work {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();

//         String reversed = "";
//         for (int i = input.length() - 1; i >= 0; i--) {
//             reversed += input.charAt(i);
//         }

//         System.out.println("Reversed string: " + reversed);
        
//         scanner.close();
//     }
// }
