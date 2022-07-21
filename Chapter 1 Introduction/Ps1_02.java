import java.util.Scanner;

public class Ps1_02 {
    public static void main(String[] args) {
        System.out.println("Enter the marks of three subjects :-");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks of phy : ");
            float phy = sc.nextFloat();
            System.out.print("Enter the marks of Chem : ");
            float chem = sc.nextFloat();
            System.out.print("Enter the marks of math : ");
            float math = sc.nextFloat();
            float CGPA = (phy + math + chem)/3;
            System.out.println("Total percentage scored is : "+(CGPA));
        }
        
    }
}
