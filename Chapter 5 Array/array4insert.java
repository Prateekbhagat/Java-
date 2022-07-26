import java.util.Scanner;

public class array4insert {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 9;
        A[1] = 4;
        A[2] = 2;
        A[3] = 3;
        A[4] = 4;
        A[5] = 5;
        int n = 6;
        int index;
        try (Scanner sc = new Scanner(System.in)) {
            index = sc.nextInt();
            int x;
            x = sc.nextInt();
            for(int i = n; i>index;i--)
            {
                A[i]  = A[i-1];
            }
            for (int i : A) {
                System.out.println("Value of x  = " + i);
            }
            A[index]= x;
        }
        System.out.println("After Execution\n");
        for (int i : A) {
            System.out.println("Value of x  = " + i);
        }
    }
}
