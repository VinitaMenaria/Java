import java.util.Scanner;
public class binomialcoefficient {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int bincoeff(int n,int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int bin_coeff=fact_n/(fact_r*fact_nmr);
        return bin_coeff;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int a=sc.nextInt();
        System.out.println("Enter value of r:");
        int b=sc.nextInt();
       int ans=bincoeff(a,b);
        System.out.println("Ans is:"+ans);
    }
}
