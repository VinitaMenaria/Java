import java.util.Scanner;

public class printsubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size= sc.nextInt();
        int[] num=new int[size];
        System.out.println("enter elements of array:");
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        printsubarray(num);
    }
    public static void printsubarray(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
           int start=i;
           for(int j=i;j<n.length;j++)
           {   int end=j;
               for(int k=start;k<=end;k++)
               {
                   System.out.print(n[k]+" ");
               }
               System.out.println();
           }
            System.out.println();
        }
    }
}
