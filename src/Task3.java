import java.util.Scanner;

public class Task3 {
    public static void main(String args[])
    {
        char number1, number2;
        int row , column;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number/character- ");
        number1=sc.next().charAt(0);
        System.out.print("Enter second number/character- ");
        number2=sc.next().charAt(0);
        System.out.println("Inverse matrix as follows for given numbers");
        System.out.print("Enter number of rows-  ");
        row=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number1);
            }
            for(int k=row -1;k>=i;k--){
                System.out.print(number2);
            }
            System.out.println();
        }
    }
}
