import java.util.Scanner;

public class pairsInArr {

    public static void printPairs(int numbers[]){
        int tp = 0 ;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("( " + current + "," + numbers[j] + ") ");
                tp++ ;
            }
        }

        // for total number of pairs 

        System.out.println("Total number of pairs are : " + tp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers to be in array");
        int numbers[] = new int[sc.nextInt()];

        System.out.println("Enter values : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        printPairs(numbers);
    }
}
