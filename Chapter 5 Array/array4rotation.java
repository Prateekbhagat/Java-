import java.util.*;

public class array4rotation {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int A[];
            A = new int[n];
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int temp = A[0];
            for(int i = 1 ; i<n;i++)
            {
                if(i == n)
                {
                    break;
                }
                A[i-1] = A[i];
            }
            A[n-1] = temp;
            System.out.println("After Rotation");
            for(int x : A)
            {
                System.out.println(x);
            }
        }
    }
}
