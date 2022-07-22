import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        int p, time;
        float rate;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        rate= sc.nextFloat();
        time = sc.nextInt();
        System.out.println((p*rate*time)/100);
    }
    
}
