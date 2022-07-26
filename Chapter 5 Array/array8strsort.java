public class array8strsort {
    public static void main(String[] args) {
        String arr[] = {"java" ,"python" ,"pascal" ,"smalltalk" ,"ada" ,"basic"};
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println("\n\nAfter sorting\n");
        java.util.Arrays.sort(arr);
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
