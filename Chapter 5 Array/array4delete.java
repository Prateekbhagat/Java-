import java.util.Scanner;

public class array4delete {
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
        }
        System.out.println("|Before Deletion|");
        for (int i : A) {
            System.out.println(i);
        }
        for (int i = index; i<n;i++)
        {
            A[i-1] = A[i];
        } 

        System.out.println("|After Deletion|");
        System.out.println();

        for (int i : A) {
            System.out.println(i);
        }
    }
}
