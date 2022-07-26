import java.util.Scanner;

public class array3search {
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
            int k;
            k = sc.nextInt();
            for(int i = 0;i<n;i++)
            {
                if(A[i] == k)
                {
                    break;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println("Value found at index ");
    }
}
