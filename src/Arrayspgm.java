import java.util.Arrays;
import java.util.Scanner;

public class Arrayspgm {
        public static void main(String args[]) {

            int array[] = {2, 4, 5, 6, 8, 10, 5, 6, 7, 1};

                Arrays.sort(array);
                int max = array[array.length - 1];
                int min = array[0];
                System.out.println(min);
                System.out.println(max);
        }
}
