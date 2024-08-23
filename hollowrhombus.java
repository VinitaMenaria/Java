import java.util.Scanner;

public class hollowrhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        hollowrhom(n,m);
    }
    public static void hollowrhom(int a,int b)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=(a-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=b;j++)
            {
                if(i==1||j==1||i==a||j==b)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
