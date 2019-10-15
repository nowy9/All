package pakietA;

import java.util.Scanner;

public class Tablicowa
{
    public static void main (String args[])
    {
        int max;
        int [] tab = new int [3];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<3; i++)
        {
            System.out.println("Podaj elemnet tablicy nr " + i);
            tab[i] = scanner.nextInt();
        }
        max = tab[0];
        for (int i=0;i<2;i++)
        {
            if (tab[i] < tab[i+1] || tab[i] == tab[i+1])
            {
                max = tab[i+1];
            }
        }

        System.out.println("Największa liczba w tej tablicy to: " + max);


    }
}
