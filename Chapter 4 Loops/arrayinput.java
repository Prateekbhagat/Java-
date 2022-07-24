import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        int array[];
        array = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i= 0; i<array.length ; i++){
                System.out.printf("\nEnter the %d number : ", i+1);
                array[i] = sc.nextInt();
            }
        }
        for(int i= 0; i<array.length ; i++){
            System.out.printf("\nThe number entered at index %d is: %d", i+1, array[i]);
        }
    }
}
