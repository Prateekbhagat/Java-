import java.util.Scanner;

public class multiplication {
    static void multiply(int n)
    {
        int result = 0;
        for(int i = 1; i<=10; i++)
        {
            result = i * n;
            System.out.printf(" %d * %d = %d \n",n,i, result);
        }
    }
    public static void main(String [] args){
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter the number : ");
            n = sc.nextInt();
            multiply(n);
        }
    }
}