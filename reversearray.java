import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        System.out.println("Enter elements of array");
        int[] n = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
        reversearray(n);
    }
    public static void reversearray(int num[]) {
        int first = 0, last = num.length - 1;
       for(int i=first;i<last;i++) {       //while(first<last)
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
        last--;
        }
        System.out.println("Reverse array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
