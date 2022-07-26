import java.util.*;

public class array3secLar {
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
            int max = A[0];
            int secmax = A[0];
            for(int i = 1; i<n;i++)
            {
                if(max < A[i])
                {
                    secmax = max ;
                    max = A[i];
                }
            }
            System.out.println();
            System.out.println(secmax);
            System.out.println(max);
        }
    }
}
