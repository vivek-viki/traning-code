import java.util.Scanner;

public class Firstjava {
    public static void main(String args[]) {
        int x, y, z, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first lab number- ");
        x = sc.nextInt();
        System.out.print("Enter second lab number- ");
        y = sc.nextInt();
        System.out.print("Enter third lab number- ");
        z = sc.nextInt();
        System.out.print("Enter number of student- ");
        n = sc.nextInt();
        if (n < x) {
            System.out.println("Lab 1");
        }
        if (n < y && n > x) {
            System.out.println("Lab 2");
        }
        if (n < z && n > x && n > y) {
            System.out.println("Lab 3");
        }
    }
}
