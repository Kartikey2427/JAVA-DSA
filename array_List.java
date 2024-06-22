import java.util.ArrayList;
public class array_List {
    public static void main(String[] args) {
        
        //creation

        ArrayList<Integer> Kartikey = new ArrayList<>();
        // ArrayList<Boolean> KT = new ArrayList<>();       

        // operation on ArrayList

        //add 
        Kartikey.add(2);
        Kartikey.add(5);
        Kartikey.add(9);
        Kartikey.add(6);
        Kartikey.add(8);

        Kartikey.add(1, 9);
        System.out.println(Kartikey);
        


        // get Element
        int element = Kartikey.get(3);
        System.out.println("Element at index is " + element);


        //Remove Element/ Delete
        Kartikey.remove(2);
        System.out.println(Kartikey);

        // Set
        Kartikey.set(2, 10);
        System.out.println(Kartikey);

        // contains element

        System.out.println(Kartikey.contains(1));
        System.out.println(Kartikey.contains(11));

        System.out.println();
        System.out.println();

        // size (method) for ArrayList
        System.out.println("Size of ArrayList:" +Kartikey.size());

        //print the arraylist

        for (int i = 0; i < Kartikey.size(); i++) {
            System.out.print(Kartikey.get(i) + " ");
        }
        System.out.println();


        // print reverse of arraylist
        for (int i = Kartikey.size() - 1; i >=0; i--) {
            System.out.print("Reverse" + Kartikey.get(i)+ " ");
        }
        System.out.println();
        System.out.println();


        // maximum in arraylist

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Kartikey.size(); i++) {
            if (max < Kartikey.get(i)) {
                max = Kartikey.get(i);
            }
        }

        System.out.println("Maximum element = " + max);

    }
}
