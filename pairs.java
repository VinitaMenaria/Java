import java.util.Scanner;

public class pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size= sc.nextInt();
        System.out.println("Enter elements of array:");
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
         pairs(array);
    }
    public static void pairs(int n[]){
        int totalpairs=0;
        for(int i=0;i<n.length;i++)
        {
            int current=n[i];
            for(int j=i+1;j<n.length;j++)
            {
                System.out.print("("+n[i]+","+n[j]+")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs= "+totalpairs);
    }
}
