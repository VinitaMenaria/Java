
import java.util.Scanner;

public class binarytodecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int result = bintodec(num);
        System.out.println("Decimal value of " + num + " is :" + result);
    }

    public static int bintodec(int binNum) {
        int pow = 0, dec = 0;
        while (binNum != 0) {
            int lastdigit = binNum % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            /* power function ko double  maanta h isliye typecast
         krke int bna diya*/
            pow++;
            binNum = binNum / 10;
        }
        return dec;
    }
}
