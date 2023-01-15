import java.util.Scanner;

public class Lab1_1
{
    public static int pow(int n1, int n2)
    {
        int res = n1;
        for(int i=1;i<=n2;i++)
        {
            res = res * n1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x = ");
        double x = in.nextDouble();

        System.out.print("Input k = ");
        int k = in.nextInt();

        System.out.print("Expected value:");
       System.out.println(Math.sin(x)/x);

       double summ = 0;

       double por = 1/(pow(10,k)*x);

        //System.out.println("por = "+por);

       double now = x;

       int number = 1;

       while(now>=por)
       {
           summ = summ + now;
           now = (-1)*(now * x * x)/(number+2);
           number+=2;
          // System.out.println("summ now = "+summ);
       }

       System.out.print("Real value = ");
       System.out.println(summ);
    }
}
