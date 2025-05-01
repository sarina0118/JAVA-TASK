// Write a method to determine whether a number is a Harshad number or not
public class task2 {
        public static void main(int num) {
            int sum = 0, temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (num % sum == 0) {
                System.out.println(num + " is a Harshad number.");
            } else {
                System.out.println(num + " is not a Harshad number.");
            }
        }
    
        public static void main(String[] args) {
            main(18);
            main(19);
        }
    }
    

