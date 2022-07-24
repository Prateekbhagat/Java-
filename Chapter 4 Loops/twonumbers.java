import java.util.Scanner;

public class twonumbers {
    public int[] twoSum(int[] nums, int target) {
        
    }
    public static void main(String[] args) {
        int nums[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Size of the array: ");
        n = sc.nextInt();
        nums = new int[n];
        int total;
        System.out.print("\nEnter the number : ");
        total = sc.nextInt();
        for(int i = 0; i<n;i++){
            System.out.printf("\nEnter the number %d : ",i+1);
            nums[i]=sc.nextInt();
        }
        int x;
        x = twoSum (nums [], total);
    }
}
