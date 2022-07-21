import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Enter the Marks");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks of Physics : ");
            float physics = sc.nextFloat();
            System.out.print("Enter the marks of Chemistry : ");
            float chemistry = sc.nextFloat();
            System.out.print("Enter the marks of Math : ");
            float math = sc.nextFloat();
            System.out.print("Enter the marks of Hindi : ");
            float hindi = sc.nextFloat();
            System.out.print("Enter the marks of English : ");
            float english = sc.nextFloat();
            float percentage = (physics + chemistry + math + hindi + english)/5;
            System.out.println("The total Percentage scored is : "+(percentage));
        }
    }
}
