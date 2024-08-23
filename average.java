import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       int ans= average(a,b,c);
        System.out.println("average of 3 no's is:"+ans);
    }
    public static int average(int p,int q,int r)
    {
        int avg=(p+q+r)/3;
        return avg;
    }
}
