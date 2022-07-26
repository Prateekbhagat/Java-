public class array5copy {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,65,7};
        System.out.println(A.length);
        int B[] = new int[(A.length) ];
        for (int i = 0 ;i<A.length;i++)
        {
            B[i] = A[i];
        }
        for(int i :B)
        {
            System.out.println(i);
        }
    }
}
