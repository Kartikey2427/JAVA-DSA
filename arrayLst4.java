import java.util.ArrayList;
public class arrayLst4 {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i +1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // pair sum

        public static boolean pairSum(ArrayList<Integer> list, int target) {
            int lp = 0;
            int rp = list.size() -1 ;

            while (lp != rp) {
                if (list.get(lp) + list.get(rp) == target) {
                    return true;
                }
                if (list.get(lp) + list.get(rp) < target) {
                    lp++;
                }
                else{
                    rp--;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));

        // pair sum
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum(list, target));
    }
}
