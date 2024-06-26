import java.util.ArrayList;
import java.util.Collections;

public class arrayLst2 {

    // Swapping the elements in arraylist

    public static void swap(ArrayList<Integer> list, int idx1 , int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(4);
        list.add(6);
        list.add(18);
        list.add(1);

        int idx1 = 1, idx2 = 2;
        System.out.print(list);
        System.out.println();
        swap(list,idx1, idx2);
        System.out.println(list);

        // sorting in ascending order

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // sorting in descending order

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
