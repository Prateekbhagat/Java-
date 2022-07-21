import java.util.Scanner;

public class Ps1_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the kilometer :- ");
            double kilometer = sc.nextDouble();
            double miles = (kilometer) * (0.621371) ;
            System.out.println("Total Miles = "+(miles));
        }
        
    }
}
