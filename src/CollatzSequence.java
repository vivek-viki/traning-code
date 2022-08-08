import java.util.Scanner;

public class CollatzSequence {
    public static int Number, i = 0;

    public static void main(String args[]) {
        
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number- ");
        Number = sc.nextInt();

            while (Number >1) {
                if(Number % 2 != 0) {
                    Number = arr[i] = (3 * Number) + 1;
                }
                else
                if(Number % 2 == 0) {
                    i++;
                    Number =  arr[i] = Number / 2;
                }

            }

        for(int j =0; j< arr.length;j++) {
            System.out.println(arr[j]);
        }
    }
}
