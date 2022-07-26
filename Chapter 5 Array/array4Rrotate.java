import java.util.*;

public class array4Rrotate {
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
            int temp = A[n-1];
            for(int i = n-1 ; i>0;i--)
            {
                // if(i == n)
                // {
                //     break;
                // }
                A[i] = A[i-1];
            }
            A[0] = temp;
            System.out.println("After Rotation");
            for(int x : A)
            {
                System.out.println(x);
            }
        }
    }
}
