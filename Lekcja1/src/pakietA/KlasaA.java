package pakietA;/*
Created by Adrian Żak on 13.07.2019.
*/

import java.util.Scanner;

public class KlasaA
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String imię, nazwisko;
        System.out.println("Jak masz na imię?");
        imię = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        nazwisko = scanner.nextLine();
        System.out.println("Cześć " + imię + " " + nazwisko);
        int x, y;
        System.out.println("Podaj pierwszą liczbę: ");
        x = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        y = scanner.nextInt();

        boolean a = jestWiekszeOd(x, y);
        System.out.println(a);



    }
    public static boolean jestWiekszeOd (int a, int b)
    {
        return a > b;
    }
}
