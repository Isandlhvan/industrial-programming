import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();                      //length of field
        int y = in.nextInt();                      //high of field

        if (x <= 32 && y <= 32)
        {
            int kol = in.nextInt();
            if (kol == 0)
            {
                for (int i = 0; i < y; i++)
                {
                    for (int j = 0; j < x; j++)
                    {
                        System.out.print("0 ");
                    }
                    System.out.println();
                }
            } else
            {
                if (kol <= x * y)
                {
                    int[] massive_kol_x = new int[kol];
                    int[] massive_kol_y = new int[kol];
                    for (int i = 0; i < kol; i++)                //input mines
                    {
                        massive_kol_x[i] = in.nextInt();
                        massive_kol_y[i] = in.nextInt();
                    }
                    for (int i = 0; i < x - 1; i++)
                    {
                        for (int j = 1; j < x; j++)
                        {
                            int temp_x = massive_kol_x[i];
                            int temp_y = massive_kol_y[i];
                            if (temp_x >= massive_kol_x[j])
                            {
                                massive_kol_x[i] = massive_kol_x[j];
                                massive_kol_x[j] = temp_x;
                                massive_kol_y[i] = massive_kol_y[j];
                                massive_kol_y[j] = temp_y;
                            }
                        }
                    }
                    for (int i = 0; i < kol; i++) {
                        System.out.print(massive_kol_x[i] + " ");
                        System.out.print(massive_kol_y[i]);
                    }
                } else System.out.println("Abort Called");
            }
        }
        else System.out.println("Abort Called");
        }
}