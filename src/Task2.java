import java.util.Scanner;

public class Task2 {
    public static void main(String args[])
    {
        int mon,tue,wed,thu,fri,sat,sun;
        int roimon,roitue,roiwed, roithu, roifri, bonus, bonusamount, extrabouns = 0;
        int totalhours, extrahours, totalamount;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Monday working hours- ");
           mon = sc.nextInt();
        System.out.print("Enter Tuesday working hours- ");
        tue = sc.nextInt();
        System.out.print("Enter wednesday working hours- ");
        wed = sc.nextInt();
        System.out.print("Enter Thursday working hours- ");
        thu = sc.nextInt();
        System.out.print("Enter Friday working hours- ");
        fri = sc.nextInt();
        System.out.print("Enter Saturday working hours- ");
        sat = sc.nextInt();
        System.out.print("Enter Sunday working hours- ");
        sun = sc.nextInt();

        totalhours = mon + tue + wed + thu + fri;
        if(totalhours > 40)
        {
            extrahours = totalhours - 40;
            extrabouns = extrahours * 25;
        }

        if(mon <= 8)
        {
            roimon = mon * 100;
        }
        else
        {
            bonus = mon - 8;
            bonusamount = bonus * 115;
            roimon = bonusamount + 800;
        }

        if(tue <= 8)
        {
            roitue = tue * 100;
        }
        else
        {
            bonus = tue - 8;
            bonusamount = bonus * 115;
            roitue = bonusamount + 800;
        }

        if(wed <= 8)
        {
            roiwed = wed * 100;
        }
        else
        {
            bonus = wed - 8;
            bonusamount = bonus * 115;
            roiwed = bonusamount + 800;
        }

        if(thu <= 8)
        {
            roithu = thu * 100;
        }
        else
        {
            bonus = thu - 8;
            bonusamount = bonus * 115;
            roithu = bonusamount + 800;
        }

        if(fri <= 8)
        {
            roifri = fri * 100;
        }
        else
        {
            bonus = fri - 8;
            bonusamount = bonus * 115;
            roifri = bonusamount + 800;
        }


        totalamount = roimon + roitue + roiwed + roithu + roifri + (sat * 150) + (sun * 100) + extrabouns;
        System.out.println("Total weekly salary" + totalamount);
    }
}
