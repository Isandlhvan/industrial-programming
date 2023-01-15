import java.util.Scanner;

//Найти строку заданной матрицы, в которой длина максимальной серии
// (последовательности одинаковых элементов) минимальна.

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        int [][] a = new int[x][y];

        int[] min_elem = new int[x];
        int[] min_por = new int[x];
        int t = 0;

        for(int i = 0; i<x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                a[i][j] = in.nextInt();
            }
        }

      int min = 0;
        int n = 0;
        for(int i = 0; i<x;i++)
        {
            int temp = 1;
            for(int j = 0; j<y-1;j++)
            {
                if(a[i][j] == a[i][j+1])
                {
                    while(a[i][j] == a[i][j+1])
                    {
                        temp+=1;
                        j++;
                        if(j == y-1)
                        {
                            break;
                        }
                    }
                }
                if(temp>min)
                {
                    min = temp;
                    n = i;
                }
            }
            min_elem[t] = min;
            min_por[t] = n;
            min = 0;
            t++;
        }
        int min_min = min_elem[0];
        int min_min_por = min_elem[0];
       for(int i = 1; i<x;i++)
       {
           if(min_elem[i]<min_min)
           {
               min_min = min_elem[i];
               min_min_por = min_por[i];
           }
       }
       System.out.println(min_min_por);
    }
}