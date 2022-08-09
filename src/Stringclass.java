import java.util.Scanner;

public class Stringclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        StringBuffer sb = new StringBuffer(s1);

        System.out.println("length of 2 strings " + s1.length() + "," + s2.length());
        System.out.println("concatenation of 2 strings: " + s1.concat(s2));
        String a[] = s1.split("@", 1);
        for (String i : a) {
            System.out.println(i);
        }

        System.out.print(sb.reverse());
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}