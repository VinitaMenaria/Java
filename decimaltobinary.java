import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int result= dectobin(num);
        System.out.println("Decimal value of "+num+" is :"+result);
    }
    public static int dectobin(int n) {
        int pow=0,binNum=0;
        while(n!=0)
        {
            int rem=n%2;
             binNum=binNum+ (int) (rem*Math.pow(10,pow));
             /*0+(1*10^0)
             1+(1*10^1)
            11+(1*10^2)*/
             pow++;
             n=n/2;
        }
        return binNum;
    }
}
