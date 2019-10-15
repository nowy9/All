package pakietA;

import java.util.Random;
import java.util.Scanner;

public class Gra
{
    public static void main (String[] args)
    {
        System.out.println("Witaj! Pomyślałem sobie pewną liczbę całkowitą z przedziału [1,100]. Zgadnij jaka to liczba");
        int liczba, odpowiedz, ile_prob=0;
        Random rnd = new Random();
        liczba = rnd.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);


        do {
            ile_prob++;
            System.out.println("To Twoja " + ile_prob + " próba.");
            odpowiedz= scanner.nextInt();
            if (odpowiedz > liczba)
            {
                System.out.println("To za dużo");
            }
            else if (odpowiedz < liczba)
            {
                System.out.println("To za mało");
            }

        }  while (odpowiedz != liczba);

        System.out.println("Brawo! Odgadłeś za " + ile_prob + " razem.");




    }
}

