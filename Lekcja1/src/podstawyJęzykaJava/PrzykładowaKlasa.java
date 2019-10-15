package podstawyJęzykaJava;
import java.util.Scanner;
/*
Created by Adrian Żak on 13.07.19.
*/

public class PrzykładowaKlasa
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        System.out.println("Start: " + start);
        long sum = 0;
        for (int i=0; i<=1000000000; i++)
        {
            sum+=i;
        }
        System.out.println("Suma wynosi: " + sum);
        long stop = System.currentTimeMillis();
        System.out.println("Stop: " + stop);
        System.out.println("Czas wykonania w ms: " + (stop-start));

        double a = 5.49;
        int b = (int) a;
        long round = Math.round(a);
        System.out.println(b);
        // 5
        System.out.println(round);
        // 6
    }
}
