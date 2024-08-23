import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter numbers in an array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter key:");
        int key = sc.nextInt();
        int index = Linear(numbers, key);
        if (index == -1) {
            System.out.println("Index not found");
        } else {
            System.out.println("Element is at position " + index);
        }
    }
    public static int Linear(int[] num, int k) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == k)
                return i;
        }
        return -1;
    }
}