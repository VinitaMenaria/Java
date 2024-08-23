import java.util.Scanner;
public class primenumber {
    public static boolean isprime(int n) {
        boolean isprime = true;
        if (n==2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void primes(int n)
    {
        for(int i=2;i<=n;i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=sc.nextInt();
        System.out.println(isprime(a));
        primes(a);
    }

}
