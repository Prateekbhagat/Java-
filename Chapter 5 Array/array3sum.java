import java.util.Scanner;

public class array3sum {
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
            int sum = 0;
            for(int x : A)
            {
                sum+=x;
            }
            System.out.println(sum);
        }
    }
}
