import java.util.Scanner;

public class Sentenceidentifiying {
    public static void main(String[] args) {
        String sentence;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the String - ");
        sentence=Sc.nextLine();
        StringBuffer newstring=new StringBuffer(sentence);

        for(int i = 0; i < sentence.length(); i++)
        {

            if(Character.isLowerCase(sentence.charAt(i)))
            {

                newstring.setCharAt(i, Character.toUpperCase(sentence.charAt(i)));
            }

            else
                if(Character.isUpperCase(sentence.charAt(i)))
            {

                newstring.setCharAt(i, Character.toLowerCase(sentence.charAt(i)));
            }
        }
        System.out.println("New String after Case  : " + newstring);
    }
}
