package podstawyJęzykaJava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LiczbyPierwsze
{
    public static void main (String[] args)
    {
        System.out.println("Z jakiego przedziału mam wyznaczyć liczby pierwsze?");
        System.out.println("Podaj największą liczbę w tym przedziale. Za najmniejszą przyjmuję 1.");
        System.out.println("Podana przez Ciebie liczba powinna być mniejsza niż milion.");
        int granica;
        Scanner scanner = new Scanner(System.in);
        granica = scanner.nextInt();
        int arrayList[] = new int [1000000];
        for(int i=0; i<granica; i++)
        {
            arrayList[i] = i+1;
        }
        int result = 0;
        for (int i=2; i<granica + 1; i++)
        {
            result += isPrime(i);
        }
        System.out.println("W tym przedziale jest " + result + " liczb pierwszych. Są to: ");
        for(int i=1; i<granica; i++)
        {
            if (isPrime(arrayList[i])==1)
                System.out.println(arrayList[i]);
        }

    }
    public static int isPrime (int n)
    {
        n = Math.abs(n);
        for(int i=2; i<n; i++)
            if (n%i==0) return 0;
            return 1;
    }
}
