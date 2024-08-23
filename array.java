import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
        int[] marks=new int[size];
        update(marks);
    }
    public static void update(int[] marks) {
       // Scanner a = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of student "+ (i+1) +" is: "+marks[i] + " ");
        }
    }
}

