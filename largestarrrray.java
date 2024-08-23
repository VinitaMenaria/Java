import java.util.Scanner;
public class largestarrrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        System.out.println("Enter elements of array:");
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int result=largestnum(num);
        System.out.println("Largest number is : "+result);
    }

    public static int largestnum(int n[]) {
        int largest=-1;
        for (int i = 0; i < n.length; i++) {
            if (largest < n[i])
                largest = n[i];
            }
        return largest;
    }
}

