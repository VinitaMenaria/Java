import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        System.out.println("Enter elements of array");
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter key:");
        int key=sc.nextInt();
     int result=binarysearch(num,key);
     if(result==-1)
         System.out.println("element not found.");
     else
         System.out.println("Element is at index "+result);
    }
    public static int binarysearch(int n[],int key )
    {
        int start=0,last=n.length-1,mid=start+last/2;
        for(int i=start;i<=mid;i++) {
            if (n[i] == key)
                return i;
        }
        for(int j=mid+1;j<=last;j++){
            if(n[j]==key)
              return j;
        }
        return -1;
    }
}