import java.util.*;
public class array3max {
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
            int min = A[0];
            for(int i = 1 ; i<n;i++)
            {
                if(max <= A[i])
                {
                    max = A[i];
                }
                if(min >= A[i])
                {
                    min = A[i];
                }
            }
            System.out.println(min);
            System.out.println(max);
        }
    }
}
