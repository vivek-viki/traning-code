import java.util.Scanner;

public class Task4 {
    public static void main(String args[])
    {
        int row, colunm, Number;
        boolean value = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row- ");
        row=sc.nextInt();
        System.out.print("Enter Colunm- ");
        colunm=sc.nextInt();
        System.out.print("Enter Number to find- ");
        Number=sc.nextInt();

        for(int i = 1; (i <= row*(colunm - 1)); i++ )
        {
            if (row * i == Number || row * (colunm - 1) == Number || Number <= row || (row * i) + 1 == Number) {
                //System.out.println("Is is an Mango tree");
                value = true;
                break;
            }
        }
    if(value)
        System.out.println("Is is an Mango tree");
    else
        System.out.println("Is is not an Mango tree");

    }
}
