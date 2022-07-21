import java.util.Scanner;

public class Ps1_01 {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers :-");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks of First number : ");
            float a = sc.nextFloat();
            System.out.print("Enter the marks of Second number : ");
            float b = sc.nextFloat();
            System.out.print("Enter the marks of Third number : ");
            float c = sc.nextFloat();
            float sum = (a + b + c);
            System.out.println("The Sum of the given three number is : "+(sum));
        }
    }
}
