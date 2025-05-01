// Create a method to check whether a given number is a palindrome prime
public class task5 {
        public static void main(int num) {
            if (isPalindrome(num) && isPrime(num)) {
                System.out.println(num + " is a Palindrome Prime.");
            } else {
                System.out.println(num + " is not a Palindrome Prime.");
            }
        }
    public static boolean isPalindrome(int num) {
            int original = num, reversed = 0;
            while (num != 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            return original == reversed;
        }
    public static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    public static void main(String[] args) {
            main(131);
            main(121);
           main(17);
        }
    }
    

