import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int max = 0;

        long [] a = new long[1000];
        long [] b = new long[1000];
        int i = 0;
        Scanner in = new Scanner(System.in);

        for( i = 0; i < 100; i++)                   //input
        {
            a[i] = in.nextInt();
            if(a[i] == 0)
            {
                break;
            }
        }

        if(a[0] == 0)
        {
            max = 0;
            System.out.println(max);
        }

        else
        {
            for(int j = 0; j < i-1; j++)
            {
                if(a[j+1]-a[j]>0)
                {
                    b[j] = 1;
                }
                else if(a[j+1]-a[j]<0)
                {
                    b[j] = -1;
                }
                else b[j] = 0;
            }

            for(int j = 0; j < i-1; j++)
            {
                long temp = b[j];
                int n = 1;
                while(temp*b[j+1]!=0 && temp*b[j+1]>0 && j<i-1)
                {
                    j++;
                    n++;
                }
                if(n>max)
                {
                    max = n;
                }
            }

            long summ = 0;

            for(int j = 0; j < i-1; j++)
            {
                summ = summ + b[j];
            }

            if(summ  == 0)
            {
                max = 1;
            }

            else {
                max = max + 1;
            }

            System.out.println(max);
        }

    }
}