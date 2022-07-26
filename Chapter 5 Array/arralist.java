import java.util.*;

public class arralist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        try (Scanner in = new Scanner(System.in)) {
            list.add(67);
            list.add(849);
            list.add(54);
            list.add(23);
            list.add(57);
            list.add(87);
            list.add(89);
            // System.out.println(list.contains(54));

            // list.set(0, 99);
            // list.remove(2);
            // System.out.println(list);

            // for(int i = 0; i< 5;i++)
            // {
            //     list.add(in.nextInt());
            // }

            // for(int i = 0; i< 10;i++)
            // {
            //     System.out.println(list.get(i));
            // }


            // ! Multi Dimensional ArrayList 

            ArrayList<ArrayList<Integer>> lis1 = new ArrayList<>();

            // ? Intialization 
            for(int i = 0; i< 3;i++)
            {
                lis1.add(new ArrayList<>());
            }

            // ? Add Elements 
            for(int i = 0; i< 3;i++)
            {
                for(int j = 0; j< 3; j++)
                {
                    lis1.get(i).add(in.nextInt());
                }
            }

            System.out.println(lis1);
        }
    }
}
 