// Write a method to count the number of words in a given string

public class task3 {
        public static void main(String str) {
            if (str == null || str.trim().isEmpty()) {
                System.out.println("Word count: 0");
                return;
            }
    
            String[] words = str.trim().split("\\s+");
            System.out.println("Word count: " + words.length);
        }
    
        public static void main(String[] args) {
            main("Java is simple and powerful");
            main("   Hello   World   ");
        }
    }
    

