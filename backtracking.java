public class backtracking {

    // updating values in array acc to user using BACKTRACKING

    public static void changeArr(int arr[] , int i , int val) {

        // base case 
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        // recursive fn
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);

        // backtracking
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // // find subsets of a given string using BACKTRACKING

    public static void findSubsets(String str ,String ans, int i){

        // base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // recursion
        // if choice is yes
        findSubsets(str, ans + str.charAt(i), i + 1 );

        // if choice is no
        findSubsets(str, ans, i + 1);
    }


    // Permutations of a String

    public static void findPermutation(String str, String ans){

        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
        char curr = str.charAt(i) ;
        String NewStr = str.substring(0, i) + str.substring(i + 1);
        findPermutation(NewStr, ans + curr);
        }
    }

    public static void main(String[] args) {

        // for array fn

        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

        // // for subsets

        String str = "abc";
        findSubsets(str,"", 0);

        // for Permutations
        String str = "xyz";
        findPermutation(str, "");
    }
}
