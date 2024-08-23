import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int palidrome=sc.nextInt();
       if(ispalidrome(palidrome)){
           System.out.println("Number is palidrome.");
       }else {
           System.out.println("Number is  not a palidrome.");
       }
    }
    public static boolean ispalidrome(int n)
    {
        int num=n,rev=0;
        while(n>0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if(num==rev)
            return true;
        else
            return false;
        }
}


