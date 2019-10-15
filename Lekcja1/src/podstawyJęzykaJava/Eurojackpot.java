package podstawyJęzykaJava;

import java.util.Random;

public class Eurojackpot
{
    public static void main(String[] args)
    {
        System.out.println("Liczby wylosowane w Eurojackpot (5 z 50) dnia 23.08.2019 to: ");
        Random rnd = new Random();
        int tab[] = new int [5];
        for(int i=0; i<5; i++)
        {
            tab[i] = rnd.nextInt(50) + 1;
        }
        while (tab[0]==tab[1] || tab[0]==tab[2] || tab[0]==tab[3] || tab[0]==tab[4])
        {
            tab[0] = rnd.nextInt(50) + 1;
        }
        while (tab[1]==tab[2] || tab[1]==tab[3] || tab[1]==tab[4])
        {
            tab[1] = rnd.nextInt(50) + 1;
        }
        while (tab[2]==tab[3] || tab[2]==tab[4])
        {
            tab[2] = rnd.nextInt(50) + 1;
        }
        while (tab[3]==tab[4])
        {
            tab[3] = rnd.nextInt(50) + 1;
        }
        for (int i=0; i<5; i++)
        {
            System.out.println(tab[i]);
        }
        System.out.println("Wylosowane euronumery (2 z 10) dnia 23.08.2019 to: ");
        int euronumer1 = rnd.nextInt(10) + 1;
        int euronumer2 = rnd.nextInt(10) + 1;
        while (euronumer1==euronumer2)
        {
            euronumer2 = rnd.nextInt(10) + 1;
        }
        System.out.println(euronumer1);
        System.out.println(euronumer2);
    }
}
