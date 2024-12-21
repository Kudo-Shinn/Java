import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        

        int[] set1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31};
        int[] set2 = {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31};
        int[] set3 = {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31};
        int[] set4 = {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31};
        int[] set5 = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};


        if (askQuestion(set1, scanner)) guess += 1;
        if (askQuestion(set2, scanner)) guess += 2;
        if (askQuestion(set3, scanner)) guess += 4;
        if (askQuestion(set4, scanner)) guess += 8;
        if (askQuestion(set5, scanner)) guess += 16;

       
        System.out.println("Your number is: " + guess);

       
        Thread.sleep(3000);
        
       
        printLargeMessage();
    }

 
    private static boolean askQuestion(int[] set, Scanner scanner) {
        System.out.println("Is your number in this list?");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println("\n(Yes or No)");
        
      
        String answer = scanner.nextLine().trim();
        
        return answer.equalsIgnoreCase("Yes");
    }

    
    private static void printLargeMessage() {
        String message = "I MISS YOU BALIK KANA PLEASE :<";

       
        for (int i = 0; i < 8; i++) { 
            System.out.println(message);
        }
    }
}
