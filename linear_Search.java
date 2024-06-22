import java.util.Scanner;

public class linear_Search {
    public static void linearSearch(int numbers[] , int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Number found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of values you want");
        int numbers[] = new int[sc.nextInt()];
        System.out.println("Enter values :");
        for (int i = 0; i < numbers.length; i++) {
        numbers[i] = sc.nextInt();
        }
        System.out.println("Enter a key");
        int key = sc.nextInt();

        linearSearch(numbers, key);
        sc.close();
    }
}
