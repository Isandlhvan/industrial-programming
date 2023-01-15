import java.util.Scanner;

//В данной действительной квадратной матрице порядка n найти min элемент.
// Получить квадратную  матрицу  порядка n+1 путем  добавления к исходной
// какой-либо строки и столбца, на пересечении которых расположен элемент с найденным значением.

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        int [][] a = new int[x][y];

        for(int i = 0; i<x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                a[i][j] = in.nextInt();
            }
        }

        int n = 0;
        int m = 0;

        int min = a[0][0];
        for(int i = 1; i<x;i++)
        {
            for(int j = 0;j<y;j++)
            {
                if(a[i][j]<min)
                {
                    min = a[i][j];
                    n = i;
                    m = j;
                }
            }
        }

        int [][]a1 = new int[x+1][y+1];
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j<y;j++)
            {
                a1[i][j] = a[i][j];
            }
        }

        for(int i = 0; i < x; i++)
        {
            a1[i][x] = a[i][n];
        }

        for(int i = 0; i < y; i++)
        {
            a1[y][i] = a[m][i];
        }

        a1[x][y] = min;

        for(int i = 0; i< x+1; i++)
        {
            for(int j = 0; j< y+1; j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}