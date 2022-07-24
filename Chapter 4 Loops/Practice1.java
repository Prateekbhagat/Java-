import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        float[] marks = { 43.2f, 90.1f, 78.4f, 87.9f, 56.9f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.printf("The total marks obtained is : %f", sum);
        float key;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter the number : ");
            key = sc.nextFloat();
        }
        boolean array = false;
        for (int i = 0; i < marks.length; i++) {
            if (key == marks[i]) {
                array = true;
                break;
            }
            else 
                array = false;
        }
        if (array == true) {
            System.out.printf("\nKey is found at index\n");
        } 
        else
            System.out.printf("\nKey not found");
        System.out.println("\nThe value of average marks is " + sum / marks.length);
    }
}
