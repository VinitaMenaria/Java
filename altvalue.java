import java.util.Scanner;

public class altvalue {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)          //matrix bnake i+j ki value check krni h
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
