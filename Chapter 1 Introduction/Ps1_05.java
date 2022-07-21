import java.util.Scanner;

public class Ps1_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           System.out.println("Enter your number : ");
           System.out.println(sc.hasNextInt()); 
        }
    }
}
 