public class maximuminarr {
    public static void main(String[] args) {
        int [] arr = {1, 2,45,633,5};
        System.out.println(max(arr));  
    }

    static int max(int [] arr)
    {
        int x = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            if(x<= arr[i])
            {
                x = arr[i];
            }
        }
        return x;
    }
}
