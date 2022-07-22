import java.util.Scanner;

public class printage {
    public static void main(String[] args) {
        String name; int age;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
        System.out.println("The name of the person is "+name+" and the age is "+age);
    }
}
