public class array5recopy {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,65,7};
        System.out.println(A.length);
        int a = A.length;
        int B[] = new int[a];
        for (int i = a -1 ;i>=0;i--)
        {
            for(int j = 0;i<A.length;j++)
            {
                B[j] = A[i];
            }
        }
        for(int i : B)
        {
            System.out.println(i);
        }
    }
}
