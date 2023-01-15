
import java.util.Scanner;
import java.util.StringTokenizer;

//Удалить из текста его часть, заключенную между двумя символами, которые вводятся
// (например, между скобками "(" и ")" или между звездочками (*) и т.п.).

public class Lab3_1
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        //String str = in.nextLine();

        String[] subStr;

        String s1 = "The( 1 123 *hallway* (smelt of *b1oiled123 (cabbage23 and* old) rag43) mats. )At\n" +
                "YOU, the123 ca9ption be56neath123 it ran1.";

        System.out.println("Input first sumbol:");
        String str1 = in.nextLine();
        System.out.println("Input second symbol:");
        String str2 = in.nextLine();

        for (int i = 0; i<s1.length();i++)
        {

        }
        /*
        System.out.println(s1);

        subStr = s1.split(str);

        String result = "";

        if(subStr.length == 1)
        {
            System.out.println("No word");
        }

        else if(subStr.length == 2)
        {
            System.out.println(subStr[0]+ str +subStr[1]);
        }
        else
        {
            for(int i = 0; i < subStr.length;i=i+2)
            {
                result  =result + subStr[i];
            }

            System.out.println(result);
        }
        */
    }
}
