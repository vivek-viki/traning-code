import java.util.Scanner;

public class Arraymeanclass {
    public static void main(String args[])
    {
        int  size, sum = 0, max_count = 0, repeatedvalue = 0;
        float mean;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[]= new int[size];
       //mean
        for (int i =0; i<size;i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Mean : " + sum/size);

        //mode
        for(int j=0;j<size;j++)
        {
            int  count = 0;
            for(int k = 0;k<size;k++)
            {
                if(arr[j] == arr[k])
                    count += 1;
            }
            if(count > max_count)
            {
                max_count = count;
                repeatedvalue  =arr[j];
            }
        }
        System.out.println(repeatedvalue);

        //median
        if(size%2==0){
            int median=arr[size/2]+arr[(size/2)+1];
            System.out.println("median "+median/2);
        }
        else{
            System.out.println("median "+arr[size/2]);
        }
    }
}
