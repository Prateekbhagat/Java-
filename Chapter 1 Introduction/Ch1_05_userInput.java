import java.util.Scanner;

public class Ch1_05_userInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user : ");    
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number 1 : ");
            // int a = sc.nextInt();
            float a = sc.nextFloat();
            System.out.print("Enter number 2 : ");
            // int b = sc.nextInt();
            float b = sc.nextFloat();
            float sum = a+b;
            System.out.println("The sum of these numbers is : ");
            System.out.println(sum);
        }
    }
}
 