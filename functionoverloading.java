import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class functionoverloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
       int ans1= sum(a,b);
       int ans2= sum(c,d,e);
        System.out.println("sum of 2 no's is:"+ans1);
        System.out.println("sum of 3 no's is:"+ans2);
    }
   public static int sum(int n,int m)
    {
        return n+m;
    }
    public static int sum(int n,int m,int k)
    {
        return n+m+k;
    }
}
