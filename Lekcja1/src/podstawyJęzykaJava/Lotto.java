package podstawyJęzykaJava;

import java.util.Random;

public class Lotto
{
    public static void main (String[] args)
    {
        System.out.println("Liczby, które nie zostaną wylosowane w Lotto dnia 05.10.2019 to: ");
        int [] tab = new int[6];
        Random rnd = new Random ();
        for (int i=0; i<6; i++)
        {
            tab[i] = rnd.nextInt(49) + 1;
            while (tab[0]==tab[1] || tab[0]==tab[2] || tab[0]==tab[3] || tab[0]==tab[4] || tab[0]==tab[5])
            {
                tab[0] = rnd.nextInt(49) + 1;
            }
            while (tab[1]==tab[2] || tab[1]==tab[3] || tab[1]==tab[4] || tab[1]==tab[5])
            {
                tab[1] = rnd.nextInt(49) + 1;
            }
            while (tab[2]==tab[3] || tab[2]==tab[4] || tab[2]==tab[5])
            {
                tab[2] = rnd.nextInt(49) + 1;
            }
            while (tab[3]==tab[4] || tab[3]==tab[5])
            {
                tab[3] = rnd.nextInt(49) + 1;
            }
            while (tab[4]==tab[5])
            {
                tab[4] = rnd.nextInt(49) + 1;
            }
        }
        for (int i=0;i<6;i++)
        {
            System.out.println(tab[i]);
        }





    }
}
